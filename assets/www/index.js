var mainText = document.getElementById("mainText");
var submitBtn = document.getElementById("submitBtn");
var fireHeading = document.getElementById("fireHeading");


// var firebaseHeadingRef = firebase.database().ref().child("Heading");
//
//   firebaseHeadingRef.on('value', function(datasnapshot){
//   fireHeading.innerText = datasnapshot.val();
// });
// Add a new comment to see if merge works

function submitClick() {

  var firebaseRef = firebase.database().ref();

  var messageText = mainText.value;

  firebaseRef.child("XizhouLi").set(messageText);



}
