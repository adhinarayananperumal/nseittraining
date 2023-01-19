

function callMe(){

alert(" you clicked !!!!!!!!!! ");
alert(document.getElementById("wmid").innerHTML);

}

function changeContent(){
document.getElementById("wmid").innerHTML="Welcome to NSEIT";
}


function changeColor(){
document.getElementById("wmid").style.color="red";
}
function validateCRForm(){

  let fname = document.forms["regForm"]["fname"].value;
  if (fname == "") {
    alert("Name must be filled out");
    document.getElementById("fn").innerHTML="Name must be filled out";
document.getElementById("fn").style.color="red";
    return false;
  }

  let age = document.forms["regForm"]["age"].value;
  if (age == "") {
    alert("Age must be filled out");
    return false;
  }

    alert("Employee Form validation success.......");
    return true;
}