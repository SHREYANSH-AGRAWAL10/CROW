<?php  

if (isset($_POST['firstname']) && isset($_POST['number']) && isset($_POST['email']) && isset($_POST['date'])) {
	include 'db_conn.php';

	function validate($data){
       $data = trim($data);
	   $data = stripslashes($data);
	   $data = htmlspecialchars($data);
	   return $data;
	}

	$firstname = validate($_POST['firstname']);
	$number = validate($_POST['number']);
	$email = validate($_POST['email']);
	$date = validate($_POST['date']);

	if (empty($firstname) || empty($number) || empty($email) || empty($date)) {
		header("Location: hospitals.html");
	}else {

		$sql = "INSERT INTO test(firstname, number, email, date) VALUES('$firstname', '$number', '$email', '$date')";
		$res = mysqli_query($conn, $sql);

		if ($res) {
			echo "Your message was sent successfully!";
		}else {
			echo "Your message could not be sent!";
		}
	}

}else {
	header("Location: hospital.html");
}
