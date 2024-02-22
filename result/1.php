<?php
include("config.php");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style1.css">
    <title>Document</title>
</head>
<body>
    <!--header section-->
    <header class="header">
        <a href="#" class="logo"> <i class="fas fa-heartbeat"></i> PORTAL </a>
        <nav class="navbar">
            <a href="#home">home</a>
            <a href="#about">Life at Uchiha University</a>
            <a href="index.php">Result</a>
            <a href="#review">review</a>
        </nav>
        </nav>
        <div id="menu-btn>" class="fas fa-bars"></div>
    </header>


     <!--Home section-->
     <section class="Home" id="Home">

        <div class="image">
            <img src="images/1.jpg" alt="">
        </div>
        <div class="content">
            <h3>
                Hello Students!!!
                <br>
                <a href="#" class="btn"> contact us <span class="fas fa-chevron-right"></span> </a>
            </h3>
        </div>
    </section>

    <!---Icon Section-->
    <section class="icons-container">

        <div class="icons">
            <i class="fas fa-user-md"></i>
            <h3>1000+</h3>
            <p>Students enrolled</p>
        </div>
        <div class="icons">
            <i class="fas fa-users"></i>
            <h3>100+ </h3>
            <p>Skilled teachers </p>
        </div>
        <div class="icons">
            <i class="fas fa-procedures"></i>
            <h3>20+</h3>
            <p>Courses </p>
        </div>
        <div class="icons">
            <i class="fas fa-hospital"></i>
            <h3>2000+</h3>
            <p>Family members</p>
        </div>
    </section>

    <!---Service section starts-->
    <section class="services" id="services">
        <h1 class="heading">Features</h1>
        <div class="box-container">
            <div class="box">
                <i class="fas fa-notes-medical"></i>
                <h3>Academics</h3>
                <a href="#" class="btn"> learn more <span class="fas fa-chevron-right"></span> </a>
            </div>
            <div class="box">
                <i class="fas fa-ambulance"></i>

                <h3>Admissions</h3>
                <a href="#" class="btn"> learn more <span class="fas fa-chevron-right"></span> </a>
            </div>
            <div class="box">
                <i class="fas fa-pills"></i>
                <h3>Placements</h3>
                <a href="#" class="btn"> learn more<span class="fas fa-chevron-right"></span></a>
            </div>
            <div class="box">
                <i class="fas fa-procedures"></i>
                <h3>Facilities</h3>
                <a href="#" class="btn"> learn more <span class="fas fa-chevron-right"></span> </a>
            </div>
        </div>
    </section>

</body>
</html>