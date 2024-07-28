<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="Homepag.css">
    <script src="https://kit.fontawesome.com/014ca51276.js" crossorigin="anonymous"></script>
    <title>Document</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top" id="textcolor">
        <div class="container">
            <a class="navbar-brand" href="#" id="navbarC">
                <img src="imge/car-logo.jpg" alt="Car Logo"> 
                <span>JantaGarage</span>
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home</a>
                    </li>
                     <li class="nav-item active">
                      	<a class="nav-link" href="Adminlogin.html">Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#about">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#Services">Services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#Team">Team</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#Review">Review</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#Contact">Contact</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
       
           <!-- carousel -->

    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="d-block w-100 " src="imge/bg-light.jpg" alt="First slide">
                <div class="carousel-caption  d-md-block  ">
                    
                    <h1>Welcome to</h1>
                    <h3>Janta<span>Garage</span></h3>
                    <p>At Janta Garage, we offer comprehensive car repair and maintenance services for all models. We will take care of your car...</p>
                    <div class="button">
                        <a href="#" class="btn btn-primary">Book Now</a>
                    </div>
                
                </div>
            </div>
            <div class="carousel-item ">
                <img class="d-block w-100" src="imge/blackcar@.jpg" alt="Second slide">
                <div class="carousel-caption  d-md-block" >
                    <h1>Welcome to</h1>
                    <h3>Janta<span>Garage</span></h3>
                    <p>At Janta Garage, we offer comprehensive car repair and maintenance services for all models. We will take care of your car...</p>
                    <div class="button">
                        <a href="#" class="btn btn-primary">Book Now</a>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img class="d-block w-100" src="imge/bg-light.jpg" alt="Third slide">
                <div class="carousel-caption  d-md-block">
                    <h1>Welcome to</h1>
                    <h3>Janta<span>Garage</span></h3>
                    <p>At Janta Garage, we offer comprehensive car repair and maintenance services for all models. We will take care of your car...</p>
                    <div class="button">
                        <a href="#" class="btn btn-primary">Book Now</a>
                    </div>
                </div>
            </div>
        </div>
        <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
        <!-- About us -->
        <div class="container">
            <h1>About <span>Us</span></h1>
            <div class="row about" id="about">
                <div class="col-md-5 col-sm-12" id="ab">
                    <img src="imge/about@.jpg" alt="About Image" class="img-fluid">
                </div>
                <div class="col-md-6 col-sm-12" id="db">
                    <h2>JantaGarage<span>Service</span></h2>
                    <p>When it comes to repairing or doing checkups on your cars, all our team combined has almost a century of practical experience. We aim to make our service as reasonably priced as possible. That's why we cut on all unessential business expenses.</p>
                    <h3>Why Choose Us</h3>
                    <ul>
                        <li>FREE Loaner Cars;</li>
                        <li>FREE Shuttle Service;</li>
                        <li>Te Dent repair</li>
                        <li>Paint scratch repair</li>
                        <li>Tire installation</li>
                        <li>Wheel alignment</li>
                    </ul>
                </div>
            </div>
        </div>
        
    <!-- services coloum -->
    <section class="wrapper" id="Services">
        <div class="container-fostrap">
            <div>
            
                <h1 class="heading">Our <span>Services</span></h1>
            </div>
            <div class="content">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12 col-sm-4">
                            <div class="card">
                                <a class="img-card" href="http://www.fostrap.com/2016/03/bootstrap-3-carousel-fade-effect.html">
                                <img src="imge/oil2.jpeg" />
                              </a>
                                <div class="card-content">
                                    <h4 class="card-title">
                                        <a href="http://www.fostrap.com/2016/03/bootstrap-3-carousel-fade-effect.html">Oil Changess
                                      </a>
                                    </h4>
                                    <p class="">
                                        Tutorial to make a carousel bootstrap by adding more wonderful effect fadein ...
                                    </p>
                                </div>
                                <div class="card-read-more">
                                    <a href="http://www.fostrap.com/2016/03/bootstrap-3-carousel-fade-effect.html" class="btn btn-link btn-block">
                                        Read More
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-4">
                            <div class="card">
                                <a class="img-card" href="http://www.fostrap.com/2016/03/5-button-hover-animation-effects-css3.html">
                                <img src="imge/tyre instalation.jpeg" />
                              </a>
                                <div class="card-content">
                                    <h4 class="card-title">
                                        <a href="http://www.fostrap.com/2016/02/awesome-material-design-responsive-menu.html">Tyre Instalation
                                      </a>
                                    </h4>
                                    <p class="">
                                        Tutorial to make a carousel bootstrap by adding more wonderful effect fadein ...
                                    </p>
                                </div>
                                <div class="card-read-more">
                                    <a href="https://codepen.io/wisnust10/full/ZWERZK/" class="btn btn-link btn-block">
                                        Read More
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-4">
                            <div class="card">
                                <a class="img-card" href="http://www.fostrap.com/2016/03/5-button-hover-animation-effects-css3.html">
                                <img src="imge/Air-conditioning.png" />
                              </a>
                                <div class="card-content">
                                    <h4 class="card-title">
                                        <a href="http://www.fostrap.com/2016/03/5-button-hover-animation-effects-css3.html">Air Conditioning
                                      </a>
                                    </h4>
                                    <p class="">
                                        Tutorial to make a carousel bootstrap by adding more wonderful effect fadein ...
                                    </p>
                                </div>
                                <div class="card-read-more">
                                    <a href="http://www.fostrap.com/2016/03/5-button-hover-animation-effects-css3.html" class="btn btn-link btn-block">
                                        Read More
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

      <!-- Our Team -->
      <section class="wrapper" id="Team" >
        <div class="container-fostrap">
            <div>
            
                <h1 class="heading">Our <span>Team</span></h1>
            </div>
            <div class="content">
                <div class="container">
                    <div class="row">
                        <div class="col-xs-12 col-sm-4">
                            <div class="card">
                                <a class="img-card" href="http://www.fostrap.com/2016/03/bootstrap-3-carousel-fade-effect.html">
                                <img src="imge/Sam1.jpg" />
                              </a>
                                <div class="card-content">
                                    <h4 class="card-title">
                                        <a href="http://www.fostrap.com/2016/03/bootstrap-3-carousel-fade-effect.html">Sam
                                      </a>
                                    </h4>
                                    <p class="">
                                        Tutorial to make a carousel bootstrap by adding more wonderful effect fadein ...
                                    </p>
                                </div>
                                <div class="card-read-more">
                                    <a href="http://www.fostrap.com/2016/03/bootstrap-3-carousel-fade-effect.html" class="btn btn-link btn-block">
                                        Read More
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-4">
                            <div class="card">
                                <a class="img-card" href="http://www.fostrap.com/2016/03/5-button-hover-animation-effects-css3.html">
                                <img src="imge/devid.avif" />
                              </a>
                                <div class="card-content">
                                    <h4 class="card-title">
                                        <a href="http://www.fostrap.com/2016/02/awesome-material-design-responsive-menu.html">Devid
                                      </a>
                                    </h4>
                                    <p class="">
                                        Tutorial to make a carousel bootstrap by adding more wonderful effect fadein ...
                                    </p>
                                </div>
                                <div class="card-read-more">
                                    <a href="https://codepen.io/wisnust10/full/ZWERZK/" class="btn btn-link btn-block">
                                        Read More
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="col-xs-12 col-sm-4">
                            <div class="card">
                                <a class="img-card" href="http://www.fostrap.com/2016/03/5-button-hover-animation-effects-css3.html">
                                <img src="imge/alisa1.jpg" />
                              </a>
                                <div class="card-content">
                                    <h4 class="card-title">
                                        <a href="http://www.fostrap.com/2016/03/5-button-hover-animation-effects-css3.html">Alisa</a>
                                      </a>
                                    </h4>
                                    <p class="">
                                        Tutorial to make a carousel bootstrap by adding more wonderful effect fadein ...
                                    </p>
                                </div>
                                <div class="card-read-more">
                                    <a href="http://www.fostrap.com/2016/03/5-button-hover-animation-effects-css3.html" class="btn btn-link btn-block">
                                        Read More
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Cliert Revies -->
    <div class="row Review" id="Review">
        <div class="textR">
            <h2>Our <span>Review</span></h2>
            <section>
                <div class="row">
                    <div class="col-md-4 mb-4">
                        <div class="card testimonial-card">
                            <div class="card-up" style="background-color:black"></div>
                            <div class="avatar mx-auto bg-white">
                                <img src="https://mdbcdn.b-cdn.net/img/Photos/Avatars/img%20(1).webp" class="rounded-circle img-fluid" />
                            </div>
                            <div class="card-body">
                                <h4 class="mb-4">Bela Smantha</h4>
                                <hr />
                                <p class="dark-grey-text mt-4">
                                    <i class="fas fa-quote-left pe-2"></i>Lorem ipsum dolor sit amet eos adipisci,
                                    consectetur adipisicing elit.
                                    <i class="fa-solid fa-star"></i>
                                    <i class="fa-solid fa-star"></i>
                                    <i class="fa-solid fa-star"></i>
                                    <i class="fa-solid fa-star"></i>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 mb-4">
                        <div class="card testimonial-card">
                            <div class="card-up" style="background-color:black"></div>
                            <div class="avatar mx-auto bg-white">
                                <img src="https://mdbcdn.b-cdn.net/img/Photos/Avatars/img%20(2).webp" class="rounded-circle img-fluid" />
                            </div>
                            <div class="card-body">
                                <h4 class="mb-4">Lisa Cudrow</h4>
                                <hr />
                                <p class="dark-grey-text mt-4">
                                    <i class="fas fa-quote-left pe-2"></i>Neque cupiditate assumenda in maiores
                                    repudi mollitia architecto.
                                    <i class="fa-solid fa-star"></i><i class="fa-solid fa-star"></i><i class="fa-solid fa-star"></i>
                                </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 mb-4">
                        <div class="card testimonial-card">
                            <div class="card-up"  style="background-color:black"></div>
                            <div class="avatar mx-auto bg-white">
                                <img src="https://mdbcdn.b-cdn.net/img/Photos/Avatars/img%20(9).webp" class="rounded-circle img-fluid" />
                            </div>
                            <div class="card-body">
                                <h4 class="mb-4">John Smith</h4>
                                <hr />
                                <p class="dark-grey-text mt-4">
                                    <i class="fas fa-quote-left pe-2"></i>Delectus impedit saepe officiis ab
                                    aliquam repellat rem unde.
                                    <i class="fa-solid fa-star"></i><i class="fa-solid fa-star"></i><i class="fa-solid fa-star"></i>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
    </div>
    
       <!-- Contact -->
         
       <div class="Contact" id="Contact">
        <h1>Contact<span>Us</span></h1>
       </div>
       
    
       <div class="container-contact">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="Section">
                    <form action="">
                        <div class="input-box">
                            <input type="text" placeholder="Name" required><i class="fa-solid fa-user"></i>
                        </div>
                        <div class="input-box">
                            <input type="number" placeholder="9146248476" required autofill="off">
                            <i class="fa-duotone fa-phone"></i>
                        </div>
                        <div class="input-box">
                            <input type="email" placeholder="prtikrindhe025@gmail.com" required autofill="off">
                            <i class="fa-solid fa-envelope"></i>
                        </div>
                        <button type="submit" id="btn">Submit</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
        
      <!-- footer -->
      <footer class= "text-center mt-2" id="footer">
        <!-- Grid container -->
        <div class="container p-4 pb-0">
          <!-- Section: Social media -->
          <section class="mb-4">
            <!-- Facebook -->
            <a
            data-mdb-ripple-init
              class="btn text-white btn-floating m-1"
              style="background-color: #3b5998;"
              href="#!"
              role="button"
              ><i class="fab fa-facebook-f"></i
            ></a>
      
            <!-- Twitter -->
            <a
              data-mdb-ripple-init
              class="btn text-white btn-floating m-1"
              style="background-color: #55acee;"
              href="#!"
              role="button"
              ><i class="fab fa-twitter"></i
            ></a>
      
            <!-- Google -->
            <a
              data-mdb-ripple-init
              class="btn text-white btn-floating m-1"
              style="background-color: #dd4b39;"
              href="#!"
              role="button"
              ><i class="fab fa-google"></i
            ></a>
      
            <!-- Instagram -->
            <a
              data-mdb-ripple-init
              class="btn text-white btn-floating m-1"
              style="background-color: #ac2bac;"
              href="#!"
              role="button"
              ><i class="fab fa-instagram"></i
            ></a>
      
            <!-- Linkedin -->
            <a
              data-mdb-ripple-init
              class="btn text-white btn-floating m-1"
              style="background-color: #0082ca;"
              href="#!"
              role="button"
              ><i class="fab fa-linkedin-in"></i
            ></a>
            <!-- Github -->
            <a
              data-mdb-ripple-init
              class="btn text-white btn-floating m-1"
              style="background-color: #333333;"
              href="#!"
              role="button"
              ><i class="fab fa-github"></i
            ></a>
            <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.05);">
                <p>@Copyright:<span>Pratik/Vaibhav</span>....<i class="fa-solid fa-heart"></i></p>
                
                 
              </div>
          </section>
          
        </div>
        <!-- Grid container -->
       
        <!-- Copyright -->
        
        <!-- Copyright -->
      </footer>

    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
