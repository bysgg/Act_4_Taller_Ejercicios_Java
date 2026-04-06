# 📦 Sistema de Televentas V1.0

Este proyecto es una simulación de un sistema básico de televentas desarrollado en Java. Permite gestionar productos, generar órdenes de compra, procesar pagos, manejar logística y registrar quejas de clientes.

---

## 🚀 Características

* Gestión de catálogo de productos
* Envío de catálogo por correo (simulado)
* Creación y procesamiento de órdenes de compra
* Integración con métodos de pago
* Control de estados de la orden
* Simulación de logística (envío)
* Registro de quejas de clientes

---

## 🏗️ Estructura del Proyecto

```
Ejercicio_1_Televentas/
└── com/televentas/
    ├── Main.java
    ├── CatalogoService.java
    ├── Producto.java
    ├── OrdenCompra.java
    ├── EstadoOrden.java
    ├── MetodoPago.java
    ├── PagoTarjeta.java
    ├── LogisticaService.java
    ├── ServicioQuejas.java
    └── IServicioInventario.java
```

---

## 🧩 Descripción de Componentes

### 🛒 Producto

Representa un producto con:

* Código
* Descripción
* Precio
* Cantidad disponible

---

### 📚 CatalogoService

Gestiona el catálogo de productos:

* Agregar productos
* Enviar catálogo por correo (simulación)

---

### 🧾 OrdenCompra

Gestiona el flujo de compra:

* Agregar productos
* Calcular total
* Procesar pago
* Controlar estado de la orden

---

### 🔄 EstadoOrden

Enum que define los estados posibles:

* `INICIADA`
* `PAGADA`
* `ARMADA`
* `ENVIADA`
* `CANCELADA`

---

### 💳 MetodoPago (Interfaz)

Define el contrato para métodos de pago:

```java
boolean procesar(double monto);
```

---

### 💳 PagoTarjeta

Implementación de pago con tarjeta:

* Simula validación bancaria
* Muestra últimos 4 dígitos

---

### 🚚 LogisticaService

Encargado de:

* Asignar transporte
* Cambiar estado a `ENVIADA`

---

### 📦 IServicioInventario

Interfaz para gestión de inventario:

* Consultar productos
* Actualizar stock
* Obtener catálogo

---

### ⚠️ ServicioQuejas

Permite registrar quejas de clientes:

* Notifica a gerencia (simulado)

---

## ▶️ Flujo de Ejecución

El programa principal (`Main.java`) realiza:

1. Creación del catálogo
2. Envío del catálogo al cliente
3. Creación de una orden de compra
4. Agregado de productos
5. Procesamiento del pago
6. Preparación del pedido
7. Registro de una queja

---

## 🖥️ Ejemplo de Salida

```
=== SISTEMA TELEVENTAS V1.0 ===

[CLIENTE] Consultando catálogo...
[EMAIL] Enviando catalogo actualizado a: sebastian@lasalle.edu.co
 - Laptop Gamer
 - Mouse Optico

Total de la orden: $3550.0
[BANCO] Pago de $3550.0 aprobado con tarjeta ****3456
[SISTEMA] Pago procesado exitosamente para Sebastian

[DEPOSITO] Armando pedido...

[GERENCIA] Queja recibida de Sebastian: El paquete llegó con la caja abollada.
[SISTEMA] Queja remitida inmediatamente al Gerente de Relaciones.

=== PROCESO FINALIZADO CON ÉXITO ===
```

---

## 🛠️ Tecnologías Utilizadas

* Java 8+
* Programación Orientada a Objetos (POO)

---

## 📌 Posibles Mejoras

* Persistencia en base de datos
* Interfaz gráfica (GUI)
* API REST
* Manejo real de correos electrónicos
* Validaciones de stock
* Manejo de errores y excepciones

---

## 👨‍💻 Autor

Proyecto académico - Sistema de Televentas - SEBASTIAN GUTIERREZ GUAYACUNDO
