# 🏛️ Sistema de Gestión Museo La Salle

Este proyecto es una simulación de un sistema de gestión para un museo. Permite administrar obras de arte, gestionar usuarios con roles específicos, registrar restauraciones, calcular el valor del inventario y simular operaciones internas del museo.

---

## 🚀 Características

* Gestión de obras de arte (cuadros y esculturas)
* Sistema de autenticación de usuarios con roles
* Registro de restauraciones e historial
* Consulta de inventario del museo
* Cálculo del valor total del patrimonio
* Simulación de cesión de obras
* Control de estados de las obras

---

## 🏗️ Estructura del Proyecto

```
Ejercicio_2_Museo/
└── com/museo/
    ├── Main.java
    ├── ObraDeArte.java
    ├── Cuadro.java
    ├── Escultura.java
    ├── GestionMuseo.java
    ├── Restauracion.java
    └── Usuario.java
```

---

## 🧩 Descripción de Componentes

### 🎨 ObraDeArte (Clase Abstracta)

Clase base para todas las obras:

* Título
* Autor
* Periodo
* Valor económico
* Estado (Expuesta, Restauración, Cedida, etc.)
* Historial de restauraciones

Funciones principales:

* `agregarRestauracion()`
* `mostrarHistorial()`

---

### 🖼️ Cuadro

Extiende `ObraDeArte`:

* Técnica (óleo, acuarela, etc.)
* Estilo artístico

---

### 🗿 Escultura

Extiende `ObraDeArte`:

* Material (bronce, mármol, etc.)
* Estilo

---

### 🏛️ GestionMuseo

Administra el inventario del museo:

* Agregar obras
* Calcular valoración total
* Simular mantenimiento

---

### 🔧 Restauracion

Representa una restauración:

* Tipo de intervención
* Fecha de inicio
* Fecha de finalización

---

### 👤 Usuario

Maneja autenticación y roles:

* `DIRECTOR`
* `RESTAURADOR`
* `ENCARGADO`

---

## ▶️ Flujo de Ejecución

El programa principal (`Main.java`) simula:

1. Creación de usuarios con roles
2. Registro de obras por el encargado
3. Consulta de obras en exhibición
4. Registro de daño y restauración
5. Consulta de historial de restauración
6. Cálculo del valor total del museo
7. Cesión de una obra a otro museo

---

## 🖥️ Ejemplo de Salida

```
=== SISTEMA DE GESTION MUSEO LA SALLE ===

[OK] Encargado autenticado. Registrando obras...
[ENCARGADO] Detalles técnicos de las obras:
Cuadro: La Noche Estrellada | Técnica: Oleo | Estilo: Impresionista
Escultura: El Pensador | Material: Bronce | Estilo: Realismo

[MONITOR VESTIBULO] Obras actualmente en sala:
 - La Noche Estrellada (Autor: Van Gogh)
 - El Pensador (Autor: Rodin)

[RESTAURADOR] Alerta: Se detecto daño en 'El Pensador'.
[RESTAURADOR] Consultando historial de la obra:
Historial de: El Pensador
   > [2026-04-05] Tipo: Reparación de grieta por caída | Fin: En curso...

[DIRECTOR] Informe de Valoración Patrimonial:
Suma total del inventario: $1500000.0

[DIRECTOR] Gestionando cesión a museo colaborador...
Obra: La Noche Estrellada
Nuevo Estado: Cedida al Museo del Louvre
Canon de cesión cobrado: $15.000 (Periodo: 6 meses)

=== FIN DE LA SIMULACION OPERATIVA ===
```

---

## 🛠️ Tecnologías Utilizadas

* Java 8+
* Programación Orientada a Objetos (POO)
* Uso de herencia y polimorfismo

---

## 📌 Posibles Mejoras

* Persistencia en base de datos
* Interfaz gráfica para gestión visual
* API REST para integración externa
* Control de permisos más robusto
* Reportes automatizados
* Sistema real de autenticación

---

## 👨‍💻 Autor

Proyecto académico - Sistema de Gestión de Museo - SEBASTIAN GUTIERREZ GUAYACUNDO
