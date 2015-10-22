var express = require('express');  
var app = express(); 

app.set('view engine', 'jade');
app.set('views', './resources/templates')
app.use(express.static('./resources'));
app.engine('html', require('ejs').renderFile);

app.get('/hello.txt', function(req, res){  
    res.send('Hello World');  
});  

app.get('/index', function(req, res){  
    //res.sendFile("/templates/index-worthy.html");  
    res.render("index-worthy.html")
});  

app.listen(3000);  
console.log('Listening on port 3000');