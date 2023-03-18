# RLstat
Programa para resolver ejercicios los siguientes ejercicios estadísticos: Probabilidad de Muestra, Intervalos de Confianza, Pruebas de Hipótesis, entre otros.
## Instrucciones: 
1. Asegúrese de tener R instalado en su computador.
2. Instalar el paquete Rserve desde la consola de R (En caso de no tenerlo instalado), lo puede instalar con 
la siguiente instrucción:

```
install.packages("Rserve")
```

3. Luego de instalar el paquete procedemos a exportar la librería de Reserve desde la consola de R, también creamos la conexión con Rserve desde la consola mismo, a continuación, están los comandos 
para exportar y crear la conexión, el resultado debe verse como el de la imagen.
```
library("Rserve")
Rserve(args = "--RS-source ~/script.R")
```
4. Ejecutamos el programa, se encuentra dentro del directorio "dist"
5. Si todos los pasos anteriores fueron correctos el programa no mostrará ningún mensaje de error, por tanto, será funcional en todas sus opciones.

## GUI: 
1. **Panel R mini:**
Desde aquí se podrá ejecutar cualquier función de R que retorne valores del tipo numérico, en panel 
izquierdo (el más grande) se ingresa la instrucción a ejecutar, el botón “R” ejecutará la instrucción y el 
resultado lo obtendremos en el panel que se encuentra debajo de la etiqueta “OUTPUT BY R”, este panel 
se creó con la finalidad de obtener desviaciones y medias de los datos a la hora de hacer uso de la 
distribución t.

2. **Panel Datos:**
Este panel es multipestañas (como los navegadores web), en cada pestaña tenemos el tipo de cálculo
estadístico que deseemos realizar (Medias muestrales, intervalos de confianza, tamaños de muestra y 
Test de Hipótesis), para ello se solicitarán los datos y luego de ingresarlos todos procedemos a hacer 
clic en el botón calcular, si los datos ingresados son correctos, en el Panel de resultados se debe reflejar 
el procedimiento del cálculo.

3. **Panel Resultados:**
En este panel se reflejará todo el procedimiento matemático de la operación que hayamos elegido en el 
panel anterior, los resultados visuales están hechos en el LaTeX, el slider de la izquierda permite 
cambiar el tamaño de los resultado.

*Nota: Usar punto como separador decimal y no coma, los porcentajes se deben ingresar en cociente 100, ósea, 
para el 80% ingresaremos 0.8.*

<sub>Sáquenme de Latinoamérica</sub>
