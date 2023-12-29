<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>회원 가입 폼</title>
  <style>
    /* CSS 스타일링 */
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }
    
    .container {
      background-color: #fff;
      padding: 30px;
      border-radius: 8px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      width: 300px;
    }
    
    h1 {
      text-align: center;
    }
    
    label {
      display: block;
      margin-bottom: 8px;
    }
    
    input[type="text"],
    input[type="email"],
    input[type="password"] {
      width: 100%;
      padding: 8px;
      margin-bottom: 15px;
      border-radius: 4px;
      border: 1px solid #ccc;
    }
    
    button[type="submit"] {
      width: 100%;
      padding: 10px;
      border: none;
      background-color: #007bff;
      color: #fff;
      border-radius: 4px;
      cursor: pointer;
      transition: background-color 0.3s ease;
    }
    
    button[type="submit"]:hover {
      background-color: #0056b3;
    }
    
    .error-message {
      color: red;
      margin-top: 5px;
      font-size: 0.8em;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>회원 가입</h1>
    <form id="signup-form" action="/submit" method="post">
      <div>
        <label for="username">사용자명:</label>
        <input type="text" id="username" name="username" required>
        <div class="error-message" id="username-error"></div>
      </div>
      <div>
        <label for="email">이메일:</label>
        <input type="email" id="email" name="email" required>
        <div class="error-message" id="email-error"></div>
      </div>
      <div>
        <label for="password">비밀번호:</label>
        <input type="password" id="password" name="password" required>
        <div class="error-message" id="password-error"></div>
      </div>
      <div>
        <label for="confirm-password">비밀번호 확인:</label>
        <input type="password" id="confirm-password" name="confirm-password" required>
        <div class="error-message" id="confirm-password-error"></div>
      </div>
      <button type="submit">가입하기</button>
    </form>
  </div>

  <script>
    // JavaScript 코드 (유효성 검사)
    const form = document.getElementById('signup-form');
    form.addEventListener('submit', function(event) {
      event.preventDefault();

      // 유효성 검사
      const username = document.getElementById('username').value;
      const email = document.getElementById('email').value;
      const password = document.getElementById('password').value;
      const confirmPassword = document.getElementById('confirm-password').value;

      const usernameError = document.getElementById('username-error');
      const emailError = document.getElementById('email-error');
      const passwordError = document.getElementById('password-error');
      const confirmPasswordError = document.getElementById('confirm-password-error');

      // 간단한 유효성 검사 (여기서는 비밀번호 일치 확인만)
      if (password !== confirmPassword) {
        confirmPasswordError.innerText = '비밀번호가 일치하지 않습니다.';
      } else {
        // 유효성 검사 통과 시, 서버에 데이터 전송하는 로직 추가 가능
        // 여기서는 간단히 메시지 출력
        alert('가입이 완료되었습니다!');
        form.reset(); // 폼 초기화
      }
    });
  </script>
</body>
</html>
