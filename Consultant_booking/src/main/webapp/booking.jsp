<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>booking</title>
     <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Roboto:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
  <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

<!-- css link -->
  <link href="assets/css/style.css" rel="stylesheet">
</head>
<body>

    <section id="appointment" class="appointment section-bg">
        <div class="container" data-aos="fade-up">
  
          <div class="section-title">
            <h2>Make an Appointment</h2>
          </div>
  
          <form action="index.jsp" method="post" role="form" class="php-email-form" data-aos="fade-up" data-aos-delay="100">
            <div class="row">
              <div class="col-md-4 form-group">
                <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" required>
              </div>
              <div class="col-md-4 form-group mt-3 mt-md-0">
                <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" required>
              </div>
              <div class="col-md-4 form-group mt-3 mt-md-0">
                <input type="tel" class="form-control" name="phone" id="phone" placeholder="Your Phone" required>
              </div>
               
            </div>
            <div class="row">
              <div class="col-md-4 form-group mt-3">
                <input type="Date" name="date" class="form-control datepicker" id="date" placeholder="Appointment Date" required>
              </div>
             
              <div class="col-md-4 form-group mt-3">
                <select name="cons" id="cons" class="form-select">
                  <option value="">Select Consultant</option>
                  <option value="Doctor 1">Mrs. John Whiteman</option>
                  <option value="Doctor 2">Sarath Peraragi</option>
                  <option value="Doctor 4">Abiram Jeshan</option>
                  <option value="Doctor 5">Amanda Jepson</option>
               
                </select>
              </div>
               <div class="col-md-4 form-group mt-3 ">
                <select name="cons" id="cons" class="form-select">
                  <option value="">Select Country</option>
                  <option value="Australia">Australia</option>
                  <option value="Canada">Canada</option>
                  <option value="New Zealand">New Zealand</option>
                  <option value="USA">USA</option>
                  <option value="USA">UK</option>
               
                </select>
              </div>
            </div>
  
            <div class="form-group mt-3">
              <textarea class="form-control" name="message" rows="5" placeholder="Message (Optional)"></textarea>
            </div>
            <div class="my-3">
              <div class="loading">Loading</div>
              <div class="error-message"></div>
              <div class="sent-message">Your appointment request has been sent successfully. Thank you!</div>
            </div>
            <div class="text-center"><button type="submit">Make an Appointment</button></div>
          </form>
  
        </div>
      </section> 
  
      <div id="preloader"></div>
      <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>
    
      <!-- Vendor JS Files -->
      <script src="assets/vendor/purecounter/purecounter_vanilla.js"></script>
      <script src="assets/vendor/aos/aos.js"></script>
      <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
      <script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
      <script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
      <!-- <script src="assets/vendor/php-email-form/validate.js"></script> -->
    
      <!-- Template Main JS File -->
      <script src="assets/js/main.js"></script>
</body>
</html> 
   