# 💰 Sistema de Administración de Gastos Mensuales

Un sistema desarrollado en Java 21 que permite administrar gastos mensuales utilizando Programación Orientada a Objetos (POO) con clases abstractas e interfaces.

## 🎯 Características

- ✅ **Gestión de gastos** por categorías específicas
- ✅ **Control de presupuesto** mensual establecido
- ✅ **Diferentes tipos de gastos**: Desayuno, Transporte, Escolares, Ahorros
- ✅ **Interfaces y clases abstractas** para diseño modular
- ✅ **Polimorfismo** para manejo uniforme de gastos
- ✅ **Verificación de gastos esenciales** vs no esenciales

## 🏗️ Estructura del Proyecto
src/
├── model/
│ ├── Gasto.java (Clase abstracta)
│ ├── GastoBase.java (Clase abstracta)
│ ├── DesayunoEscuela.java
│ ├── Transporte.java
│ ├── GastosEscolares.java
│ └── Ahorros.java
├── service/
│ ├── Gestionable.java (Interfaz)
│ ├── Presupuestable.java (Interfaz)
│ └── AdministradorGastos.java
└── Main.java


## 📊 Categorías de Gastos Implementadas

1. **🍎 Desayuno en la Escuela** - $700 mensuales
2. **🚌 Transporte** - $520 mensuales
3. **📚 Gastos Escolares** - $20 mensuales
4. **💰 Ahorros** - $200 mensuales

**Presupuesto total:** $2,000 mensuales

## 🚀 Cómo Ejecutar el Proyecto

### Prerrequisitos
- **Java JDK 21** o superior
- **IntelliJ IDEA** (recomendado) o cualquier IDE Java

### Pasos para ejecutar:

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/TU_USUARIO/sistema-gastos-mensuales.git
   cd sistema-gastos-mensuales

Abrir en IntelliJ IDEA:

File → Open → Seleccionar la carpeta del proyecto

Asegurarse de tener JDK 21 configurado

Compilar y ejecutar:

Click derecho en Main.java

Seleccionar "Run 'Main.main()'"

O usar el shortcut: Ctrl+Shift+F10 (Windows/Linux) / Control+Shift+R (Mac)

-Ejecución desde terminal:
bash
cd src
javac Main.java
java Main

📈 Ejemplo de Salida
text
=== SISTEMA DE ADMINISTRACIÓN DE GASTOS MENSUALES ===

Agregando gastos...
Gasto agregado: Desayuno escolar mensual
Gasto agregado: Transporte escolar
Gasto agregado: Materiales escolares
Gasto agregado: Ahorro para educación

=== RESUMEN MENSUAL ===
Presupuesto: $2000.0
Total gastado: $1440.0
Saldo restante: $560.0
Dentro del presupuesto: Sí

=== GASTOS ESENCIALES ===
✓ Desayuno escolar mensual - Desayuno Escuela (Recurrente: Sí)...
✓ Transporte escolar - Transporte (Recurrente: Sí)...
✓ Materiales escolares - Gastos Escolares (Recurrente: No)...
🛠️ Tecnologías Utilizadas
Java 21

Programación Orientada a Objetos (POO)

Clases Abstractas

Interfaces

Polimorfismo

Encapsulamiento

IntelliJ IDEA

👨‍💻 Conceptos de POO Implementados
🔷 Abstracción: Clases abstractas Gasto y GastoBase

📑 Interfaces: Gestionable y Presupuestable

🔄 Herencia: Clases hijas que extienden GastoBase

🎭 Polimorfismo: Tratar todos los gastos como tipo Gasto

📦 Encapsulamiento: Atributos privados con métodos públicos

📝 Funcionalidades Principales
Agregar y eliminar gastos

Calcular total de gastos y saldo restante

Mostrar resumen mensual

Filtrar gastos esenciales

Verificar estado del presupuesto

Agrupar gastos por categoría

🤝 Contribuciones
Las contribuciones son bienvenidas. Por favor:

Fork el proyecto

Crea una rama para tu feature (git checkout -b feature/AmazingFeature)

Commit tus cambios (git commit -m 'Add some AmazingFeature')

Push a la rama (git push origin feature/AmazingFeature)

Abre un Pull Request