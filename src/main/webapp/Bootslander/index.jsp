<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import= "org.redi.backend.Student" %>

<!DOCTYPE HTML>
<html>

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

  <title>Pearson Institude</title>

  <meta name="keywords" content="" />
  <meta name="description" content="" />

  <!-- css -->
  <link rel="stylesheet" href="css/bootstrap.css" />
  <link rel="stylesheet" href="css/bootstrap-responsive.css" />
  <link rel="stylesheet" href="css/prettyPhoto.css" />
  <link rel="stylesheet" href="css/sequence.css" />
  <link rel="stylesheet" href="css/style.css" />

  <!-- Favicon -->
  <link rel="shortcut icon" href="img/favicon.ico">

  <!-- =======================================================
   
	======================================================= -->
</head>

<body>

<%!

Student studentTemp = new Student();

%>
<%


studentTemp =(Student)session.getAttribute("student");



%>

 <a Class = "w3-bar-item w3-button active" href="updateProfile.jsp" title="Update_Profile">Profile</a> 


  <!-- main wrap -->
  <div class="main-wrap">

    <!-- header -->
    <header>
      <!-- top area -->
      <div class="top-nav">
        <div class="wrapper">
          <div class="logo">
            <a href="index.html">
              <!-- your logo image -->
              <img src="img/logo.png" alt="" />
            </a>
          </div>

          <div class="phone">
            <p>LOGGED IN AS  <% 
            
            if(studentTemp!=null)
            {
            
            	out.println( studentTemp.getName());
            	
           
            }%></p>
          </div>
        </div>
      </div>
      <!-- end top area -->
    </header>
    <!-- end of header-->

    <!-- section intro -->
    <section id="intro">
      <div class="featured">
        <div class="wrapper">

          <div class="row-fluid">
            <!-- slider -->
            <div class="span12">

              <div id="sequence-theme">
                <div id="sequence">
                  <img class="prev" src="img/slides/bt-prev.png" alt="Previous Frame" />
                  <img class="next" src="img/slides/bt-next.png" alt="Next Frame" />
                  <ul>
                    <li class="animate-in">
                      <h2 class="title">Welcome to Pearson institude of higer Education</h2>
                      <h5 class="subtitle">Graduation and innovation in not an option</h5>
                      <img class="model" src="img/slides/project33.jpg" alt="" />
                    </li>
                    <li>
                      <h2 class="title">Register now 2019</h2>
                      <h5 class="subtitle">Get latest campus trands and courses</h5>
                      <img class="model" src="img/slides/img4.png" alt="" />
                    </li>
                    <li>
                      <h2 class="title">Student life and more on all our remote Campuses</h2>
                      <h5 class="subtitle">Check latest prospectors</h5>
                      <img class="model" src="img/slides/project3.jpg" alt="" />
                    </li>
                  </ul>
                </div>
                <ul class="nav">
                  <li><img src="img/slides/thumb1.png" alt="Thumbnail" /></li>
                  <li><img src="img/slides/thumb2.png" alt="Thumbnail" /></li>
                  <li><img src="img/slides/thumb3.png" alt="Thumbnail" /></li>
                </ul>
              </div>

            </div>
            <!-- end slider -->
          </div>

        </div>
      </div>
    </section>
    <!-- end section intro -->

    <!-- section main content -->
    <section id="main-content">
      <div class="content-wrap">

        <!-- tagline -->
        <div class="tagline">
          <div class="wrapper">
            <!--### Subtitle ###-->
            <h2>Student advicers helping you to make better career choices</h2>
            <!-- CTA -->
            <div class="cta">
              <div class="btn-group">
                <a href="updateProfile.jsp" class="btn btn-green btn-large"><i class="icon-shopping-cart icon-white"></i>Profile</a>
                <a href="https://bootstrapmade.com/bootslander-free-bootstrap-landing-page-template/#download" class="btn btn-red btn-large">Check faculty</a>
              </div>
            </div>
          </div>
        </div>
        <!-- end tagline -->

        <!-- wrapper -->
        <div class="wrapper">

          <!-- boxes -->
          <div class="boxes">
            <div class="row-fluid">

              <!-- box 1 -->
              <div class="span4">
                <div class="box">
                  <div class="icon">
                    <img src="img/icons/icon-1.png" class="" alt="" />
                  </div>
                  <h4>Easy to customize</h4>
                  <p> Optimal viewing experience with a minimum of resizing, and scrolling across a wide range of devices </p>
                  <a href="#" class="textlink">Learn more</a>
                </div>
              </div>

              <!-- box 2 -->
              <div class="span4">
                <div class="box">
                  <div class="icon">
                    <img src="img/icons/icon-2.png" class="" alt="" />
                  </div>
                  <h4>High conversion</h4>
                  <p> Optimal viewing experience with a minimum of resizing, and scrolling across a wide range of devices </p>
                  <a href="#" class="textlink">Learn more</a>
                </div>
              </div>

              <!-- box 3 -->
              <div class="span4">
                <div class="box">
                  <div class="icon">
                    <img src="img/icons/icon-3.png" class="" alt="" />
                  </div>
                  <h4> Responsive Layout</h4>
                  <p> Optimal viewing experience with a minimum of resizing, and scrolling across a wide range of devices </p>
                  <a href="#" class="textlink">Learn more</a>
                </div>
              </div>

            </div>

          </div>
          <!-- end boxes -->


          <!-- recent portfolio -->
          <div class="row-fluid portfolio">
            <div class="headline">
              <h2><span>Checkout our university mobile application</span></h2></div>
            <ul class="portfolio_list da-thumbs">

              <li class="span3">
                <img src="img/dummies/img1.jpg" alt="img">
                <article class="da-animate da-slideFromRight" style="display: block;">
                  <h5>Portfolio item</h5>
                  <span class="link_post"><a href="#"></a></span>
                  <span class="zoom"><a data-pretty="prettyPhoto[works]" href="img/dummies/big1.jpg"></a></span>
                </article>
              </li>
              <li class="span3">
                <img src="img/dummies/img2.jpg" alt="img">
                <article class="da-animate da-slideFromRight" style="display: block;">
                  <h5>Portfolio item</h5>
                  <span class="link_post"><a href="#"></a></span>
                  <span class="zoom"><a data-pretty="prettyPhoto[works]" href="img/dummies/big1.jpg"></a></span>
                </article>
              </li>
              <li class="span3">
                <img src="img/dummies/img3.jpg" alt="img">
                <article class="da-animate da-slideFromRight" style="display: block;">
                  <h5>Portfolio item</h5>
                  <span class="link_post"><a href="#"></a></span>
                  <span class="zoom"><a data-pretty="prettyPhoto" href="img/dummies/big1.jpg"></a></span>
                </article>
              </li>
              <li class="span3">
                <img src="img/dummies/img4.jpg" alt="img">
                <article class="da-animate da-slideFromRight" style="display: block;">
                  <h5>Portfolio item</h5>
                  <span class="link_post"><a href="#"></a></span>
                  <span class="zoom"><a data-pretty="prettyPhoto" href="img/dummies/big1.jpg"></a></span>
                </article>
              </li>
            </ul>

          </div>
          <!-- end portfolio -->


          <!-- testimonials -->
          <div class="row-fluid testimonials">
            <div class="headline">
              <h2><span>What people are saying</span></h2></div>
            <ul>
              <li class="span4">
                <div class="testimonial">
                  <img src="img/dummies/user-1.png" alt="" class="img-circle" />
                  <p>
                    &ldquo;Student advisors are at the heart of our student support services. Every campus has a team of dedicated Student Advisors. They are there to support you on your learning journey from enrolment right through to graduation. Your allocated Student Advisor is there to assist with general queries or difficulties you may be experiencing. I.&rdquo;
                  </p>
                  <span>&#45;&#45; Mike lamouz, <a href="#">Net designer</a></span>
                </div>
              </li>
              <li class="span4">
                <div class="testimonial">
                  <img src="img/dummies/user-2.png" alt="" class="img-circle" />
                  <p>
                    &ldquo;Student advisors are at the heart of our student support services. Every campus has a team of dedicated Student Advisors. They are there to support you on your learning journey from enrolment right through to graduation. Your allocated Student Advisor is there to assist with general queries or difficulties you may be experiencing. I.&rdquo;
                  </p>
                  <span>&#45;&#45; Leslie samarov, <a href="#">JIK Company</a></span>
                </div>
              </li>
              <li class="span4">
                <div class="testimonial">
                  <img src="img/dummies/user-3.png" alt="" class="img-circle" />
                  <p>
                    &ldquo;Student advisors are at the heart of our student support services. Every campus has a team of dedicated Student Advisors. They are there to support you on your learning journey from enrolment right through to graduation. Your allocated Student Advisor is there to assist with general queries or difficulties you may be experiencing. I.&rdquo;
                  </p>
                  <span>&#45;&#45; Jonathan does, <a href="#">App Studio</a></span>
                </div>
              </li>

            </ul>
          </div>

        </div>
        <!-- end wrapper -->

      </div>
    </section>
    <!-- end main content section -->

    <!-- section bottom -->
    <section id="bottom">
      <div class="bottom-cta">
        <div class="wrapper">
          <h3 class="title">Our campus</h3>
          <h2> </h2>
          <a href="#" class="btn btn-red btn-large">Faculty</a>
        </div>
      </div>
    </section>
    <!-- end section bottom -->


    <!-- section contact -->
    <section id="contact">
      <div class="container">
        <div class="row">
          <div class="span8">
            <h4>Get in touch with us by filling contact form below</h4>

            <form method="post" class="contactForm">

              <div id="sendmessage">Your message has been sent. Thank you!</div>
              <div id="errormessage"></div>

              <div class="row">
                <div class="span4 field form-group">
                  <input type="text" name="name" placeholder="* Enter your full name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                  <div class="validation"></div>
                </div>
                <div class="span4 field form-group">
                  <input type="text" name="email" placeholder="* Enter your email address" data-rule="email" data-msg="Please enter a valid email" />
                  <div class="validation"></div>
                </div>
                <div class="span8 margintop10 field form-group">
                  <input type="text" name="subject" placeholder="Enter your subject" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                  <div class="validation"></div>
                </div>
                <div class="span8 margintop10 field form-group">
                  <textarea rows="12" name="message" class="input-block-level" placeholder="* Your message here..." data-rule="required" data-msg="Please write something"></textarea>
                  <div class="validation"></div>

                  <p>
                    <button class="btn btn-theme btn-medium margintop10 pull-left" type="submit">Send message</button>
                    <span class="pull-right margintop20">* Please fill all required form field, thanks!</span>
                  </p>
                </div>
              </div>
            </form>
          </div>
          <div class="span4">
            <div class="clearfix"></div>
            <aside class="right-sidebar">

              <div class="widget">
                <h5 class="widgetheading">Contact information<span></span></h5>

                <ul class="contact-info">
                  <li><label>Address :</label> 22 Ixai road primrose<br /> Midrand</li>
                  <li><label>Phone :</label>011 873 1867</li>
                  <li><label>Fax : </label>+62 123 456 10 </li>
                  <li><label>Email : </label> info@PersonInstitude.co.za</li>
                </ul>

              </div>
            </aside>
          </div>
        </div>
      </div>
    </section>
    <!-- end section contact -->

    <!-- footer -->
    <footer>
      <div class="footer">
        <div class="wrapper">
          <div class="social">
            <a href="#" class="fb"> </a> <a href="#" class="tw"> </a>
          </div>

          <div class="subfooter">
            <ul>
              <li><a href="#">Home</a> &#45; </li>
              <li><a href="#">Terms conditions</a> &#45; </li>
              <li><a href="#">Contact</a></li>
            </ul>
            <p class="copyright">&#169; Copyright. All rights reserved</p>

          </div>
          <div class="credits">
           
            Designed by <a href="https://bootstrapmade.com/">Leratomalatji</a>
          </div>
        </div>
      </div>
    </footer>


  </div>
  <!-- end main wrap -->

  <!-- Javascript Libraries -->
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.js"></script>
  <script src="js/jquery.prettyPhoto.js"></script>
  <script src="js/sequence.jquery.js"></script>
  <script src="js/jquery-hover-effect.js"></script>

  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

  <!-- Template Custom Javascript File -->
  <script src="js/custom.js"></script>

</body>

</html>
