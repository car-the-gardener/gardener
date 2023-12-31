$(() => {
  //DOM트리에서 form객체찾기
  const formObj = $("form.signup");

  //아이디 입력란 객체 찾기
  const inputIdObj = $("form.signup>input[name=loginId]");

  //아이디 중복확인 버튼 객체 찾기
  const btIdDupChk = $("form.signup button.iddupchk");

  //이메일 입력란 객체 찾기
  const inputEmailObj = $("form.signup>input[name=email]");

  //필명 입력란 객체 찾기
  const inputNameObj = $("form.signup>input[name=name]");

  //가입버튼 객체 찾기
  const btSignup = $("form.signup.bt-Signup");

  //필명 중복확인 버튼

  btIdDupChk.click(() => {
    const loginId = $("input[name='loginId']").val();
    $.ajax({
      url: "http://localhost:8888/back/iddupchk",
      methoed: "get",
      data: `idcheck=${loginId}`,
      success: (responseData) => {
        console.log(responseData);
        if (responseData === "1") {
          alert("사용 가능한 아이디 입니다");
        } else {
          alert("중복된 아이디 입니다, 다른 아이디를 입력해주세요");
        }
      },
    });
  });

  formObj.submit((e) => {
    $(e.target)
      .attr("action", "http://localhost:8888/back/signup")
      .attr("method", "post");
    $.ajax({
      url: formObj.attr("action"),
      method: formObj.attr("method"),
      data: formObj.serialize(),
      success: (responseObj) => {
        console.log(responseObj);
        if (responseObj === "1") {
          //가입 성공인경우
          swal("회원가입이 되었습니다");
          location.href = "./login.html"; //페이지 이동
        } else {
          //가입 실패인경우
          alert(responseObj.msg);
        }
      },
      error: (xhr) => {
        alert("에러:" + xhr.status);
      },
    });
    return false;
  });
});
