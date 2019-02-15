'use strict';


// Declare app level module which depends on filters, and services
var app = angular.module('adminTienda', [
    'ngRoute',
    'adminTienda.controllers'
]);
app.config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {templateUrl: 'partials/menu.html'});
        $routeProvider.when('/Factura', {templateUrl: 'partials/Factura.html', controller: 'FacturaController'});
        $routeProvider.when('/Productos', {templateUrl: 'partials/Productos.html', controller: 'ProductoCtrl'});
        $routeProvider.when('/DetalleFactura', {templateUrl: 'partials/Factura.html', controller: 'DetalleFacturaCtrl'});
//      la   $routeProvider.when('/Municipio', {templateUrl: 'partials/Municipio.html', controller: 'MunicipioCtrl'});
//        $routeProvider.when('/Facultad', {templateUrl: 'partials/Facultad.html', controller: 'FacultadCtrl'});
//        $routeProvider.when('/Estudiante', {templateUrl: 'partials/Estudiante.html', controller: 'EstudianteCtrl'});
//        $routeProvider.when('/Profesor', {templateUrl: 'partials/Profesor.html', controller: 'ProfesorCtrl'});
//        $routeProvider.when('/Materia', {templateUrl: 'partials/Materia.html', controller: 'MateriaCtrl'});
//        $routeProvider.when('/Matricula', {templateUrl: 'partials/Matricula.html', controller: 'MatriculaCtrl'});
//        $routeProvider.when('/Horario', {templateUrl: 'partials/Horario.html', controller: 'HorarioCtrl'});
        $routeProvider.otherwise({redirectTo: '/'});
    }]);

var module = angular.module("adminTienda.controllers", []);
