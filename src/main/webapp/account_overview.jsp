<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

  // Sample data for demonstration purposes
  double accountBalance = 5000.00; // Replace with actual balance from database
  String[] recentTransactions = {
          "Deposit: $1000",
          "Withdrawal: $200",
          "Transfer to user123: $150",
          "Deposit: $500"
  };
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Account Overview - Online Banking System</title>
  <link rel="stylesheet" href="./css/overview.css">
  <script src="script.js" defer></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Abel&family=Arimo:ital,wght@0,400..700;1,400..700&family=Josefin+Sans:ital,wght@0,100..700;1,100..700&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Syne:wght@400..800&display=swap" rel="stylesheet">
</head>
<body>
<header>
  <div class="container">
    <h1>Account Overview</h1>
    <nav>
      <ul>
        <li><a href="operations.jsp.jsp">Home</a></li>
        <li><a href="#">Account Overview</a></li>
        <li><a href="#">Transfer Funds</a></li>
        <li><a href="#">Transaction History</a></li>
        <li><a href="#">Logout</a></li>
      </ul>
    </nav>
  </div>
</header>

<main class="container">
  <section class="card overview-card">
    <h2>Hello!</h2>
    <p>Your current balance: <strong>$<%= String.format("%.2f", accountBalance) %></strong></p>
    <button onclick="alert('Feature coming soon!')">View Account Details</button>
  </section>

  <section class="card transactions-card">
    <h2>Recent Transactions</h2>
    <ul id="transactionHistory">
      <% for (String transaction : recentTransactions) { %>
      <li><%= transaction %></li>
      <% } %>
    </ul>
  </section>

  <section class="card contact-card">
    <h2>Contact Support</h2>
    <p>If you have any questions or need assistance, please contact our support team.</p>
    <button onclick="alert('Contact support feature coming soon!')">Contact Support</button>
  </section>

</main>



</body>
</html>