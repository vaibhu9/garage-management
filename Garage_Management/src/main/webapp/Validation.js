
//Name Validation
//=========================================================
function isNameValid(name) {
	const namePattern = /^[a-zA-Z\s]+$/g

	let result = name.match(namePattern);

	var spanTag = document.getElementById("namemsg");

	if (result != null) {
		/*spanTag.innerHTML = "Valid name";*/
		spanTag.style.color = "green";
	}
	else {

		/*spanTag.innerHTML = "Invalid name";*/
		spanTag.style.color = "red";
	}
}


//First Name Validation
//=========================================================
function isFirstNameValid(fname) {
	const firstNamePattern = /^[a-zA-Z]+$/g

	let result = fname.match(firstNamePattern);

	var spanTag = document.getElementById("fnamemsg");

	if (result != null) {
		/*spanTag.innerHTML = "Valid name";*/
		spanTag.style.color = "green";
	}
	else {

		/*spanTag.innerHTML = "Invalid name";*/
		spanTag.style.color = "red";
	}
}


//Last Name Validation
//=========================================================
function isLastNameValid(lname) {
	const lastNamePattern = /^[a-zA-Z]+$/g

	let result = lname.match(lastNamePattern);

	var spanTag = document.getElementById("lnamemsg");

	if (result != null) {
		/*spanTag.innerHTML = "Valid name";*/
		spanTag.style.color = "green";
	}
	else {

		/*spanTag.innerHTML = "Invalid name";*/
		spanTag.style.color = "red";
	}
}


//Email Validation
//=========================================================
function isEmailValid(email) {
	//const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
	const emailPattern = /^[a-z0-9._-]+@[a-z0-9._-]+\.[a-z]{2,3}$/g;

	let result = email.match(emailPattern);

	var spanTag = document.getElementById("emailmsg")

	//	if (emailPattern.test(String(email).toLowerCase())) {
	if (result != null) {
		spanTag.innerHTML = "Valid email";
		spanTag.style.color = "green";
	}
	else {
		spanTag.innerHTML = "Invalid email";
		spanTag.style.color = "red";
	}
}


//Mobile Number Validation
//=========================================================
function isMobileNumberValid(mobileNumber) {
	const mobileNumberPattern = /^[6-9]{1}\d{9}$/;

	let result = mobileNumber.match(mobileNumberPattern);

	var spanTag = document.getElementById("mobileNumbermsg");
	if (result != null) {
		spanTag.innerHTML = "Valid mobile number";
		spanTag.style.color = "green";
	}
	else {

		spanTag.innerHTML = "Invalid mobile number";
		spanTag.style.color = "red";
	}
}


//Strong Password Validation
//=========================================================
function isPasswordStrong(password){
	const passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@.#$!%*?&])[A-Za-z\d@.#$!%*?&]{8,15}$/;
	
	let result = password.match(passwordPattern);
	
	var spanTag = document.getElementById("passwordmsg");
	if(result!=null){
		spanTag.innerHTML="Strong password";
		spanTag.style.color="green"
	}
	else{
		spanTag.innerHTML="Weak password";
		spanTag.style.color="red";
	}
}


//Aadhar Card Validation
//=========================================================
function isAadharValid(aadharNumber) {
	const aadharPattern = /^[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}$/;

	let result = aadharNumber.match(aadharPattern);

	var spanTag = document.getElementById("aadharmsg");
	if (result != null) {
		spanTag.innerHTML = "Valid aadhar number";
		spanTag.style.color = "green";
	}
	else {

		spanTag.innerHTML = "Invalid aadhar number";
		spanTag.style.color = "red";
	}
}


//Pan Card Validation
//=========================================================
function isPandCardValid(panCardNumber) {
	const panCardPattern = /^[A-Z]{5}[0-9]{4}[A-Z]{1}$/;

	let result = panCardNumber.match(panCardPattern);

	var spanTag = document.getElementById("pancardmsg");
	if (result != null) {
		spanTag.innerHTML = "Valid pan card number";
		spanTag.style.color = "green";
	}
	else {

		spanTag.innerHTML = "Invalid pan card number";
		spanTag.style.color = "red";
	}
}

