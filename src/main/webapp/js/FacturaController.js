//var listaProductos = [{id: 1, nombre: 'papas', valor: 200}, {id: 2, nombre: 'pan', valor: 200}];
module.controller('FacturaController', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        $scope.listaProductos = null;
        $scope.listaDetallesAux = [];
        $scope.id = 1;
        $scope.datosDetalleFactura = {};

        $scope.getProducto = function () {
            $http.get("./webresources/ServicioProducto", {})
                    .then(function (response) {
                        console.log(response.data);
                        $scope.listaProductos = response.data;
                    }, function () {
                        alert("error");
                    });
        }

        $scope.datosFactura = {listaDetalleF: []};

        $scope.listaFactura = null;
//factura
        $scope.getFactura = function () {
            $http.get("./webresources/ServicioFactura", {})
                    .then(function (response) {
                        console.log(response.data);
                        $scope.listaFactura = response.data;
                    }, function () {
                        alert("error");
                    });
        }
        //agregat detalle 
        $scope.guardarDetalleFactura = function () {
            $http.post("./webresources/ServicioDetalleFactura", $scope.datosDetalleFactura)
                    .then(function (response) {
                        console.log(response.data);
                        $scope.getDetalleFactura();
                    }, function () {
                        alert("error");
                    });
        }
        //guardar factura
        $scope.guardarFactura = function () {
            console.log("yo no guaardo");
            $http.post("./webresources/ServicioFactura", $scope.datosFactura)
                    .then(function (response) {
                        console.log(response.data);
                        $scope.getFactura();
                    }, function () {
                        alert("error");
                    });
        }
        $scope.agregar = function (data) {
            $scope.datosDF = {}
            //$scope.listaDetalles.factura.id = 
            console.log('agregado a carrito');
            console.log($scope.listaProductos.length);
          
            for (var i = 0; i < $scope.listaProductos.length; i++) {
                if ($scope.listaProductos[i] == data) {
                       
                    $scope.datosDF.idDetalle = $scope.id++;
                    $scope.datosDF.producto = $scope.listaProductos[i];
                    $scope.datosDF.totalProducto = data.valor * $scope.datosDetalleFactura.cantidad[i];
                    $scope.datosDF.cantidad = $scope.datosDetalleFactura.cantidad;
//                    console.log('aqui voy' +  $scope.datosDetalleFactura.idDetalle + "p" + $scope.datosDetalleFactura.producto.nombre);
//                    $scope.listaDetalles.push($scope.datosDetalleFactura);
                    
                    $scope.datosFactura.listaDetalleF.push($scope.datosDF.valueOf());
                        console.log($scope.datosFactura);
                    

                   
                }
            }
            var suma = 0;
            for (var i = 0; i <  $scope.datosFactura.listaDetalleF.length; i++) {
                
                suma += $scope.datosFactura.listaDetalleF[i].totalProducto;
                console.log(suma + "= suma")
                  $scope.datosFactura.valorFactura = suma;
            }
               
              
//        $scope.listaProductos={};
        }
        $scope.comprar = function () {

            $scope.datosFactura.valorFactura = 60000;
            console.log("holi" + $scope.datosFactura.valorFactura);
            $scope.guardarFactura();
        }

        $scope.getDetalleFactura = function () {
            $http.get("./webresources/ServicioDetalleFactura", {})
                    .then(function (response) {
                        console.log(response.data);
                        for (var i = 0; $scope.datosFactura.listaDetalleF.length; i++) {
                            $scope.datosFactura.listaDetalleF = response.data;
                        }
                    }, function () {
                        alert("error");
                    });
        };
        $scope.getProducto();
        $scope.getDetalleFactura();

    }]);


