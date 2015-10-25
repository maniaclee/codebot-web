var Sequelize = require('sequelize');
var sequelize = new Sequelize('user', 'root', '', {host : '127.0.0.1', port : '3306', dialect : 'mysql'});
// definition
var Task = sequelize.define('Task', {
    // auto increment, primaryKey, unique
    id : {type : Sequelize.INTEGER, autoIncrement : true, primaryKey : true, unique : true},

    // comment
    title : {type : Sequelize.STRING, comment : 'Task title'},

    // allow null
    description : {type : Sequelize.TEXT, allowNull : true},

    // default value
    deadline : {type : Sequelize.DATE, defaultValue : Sequelize.NOW}
});