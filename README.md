<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>:Informe de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Pilas y Colas</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>03</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA DE PRESENTACIÓN:</td><td>05-Junio-2022</td><td>HORA DE PRESENTACIÓN:</td><td colspan="3">23:55</td>
</tr>
<tr><td colspan="4">Integrantes:
        <ul>
            <li><h5>Escobar Atamari, Diego Gabriel</h5></li>
            <li><h5>Flores Sucupaca, Ervin Eleazar </h5></li>
            <li><h5>Machicao Quispe, Gabriel Steven</h5></li>
            <li><h5>Moroccoire Pacompia Anthony Marcos</h5></li>
            <li><h5>Quispe Bejar, Garlet Analy</h5></li>
        </ul>
    </td>
    <td colspan="2">Nota:</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tdbody>
</table>

<table>
    <theader>
        <tr><th colspan="6">SOLUCIÓN Y RESULTADOS</th></tr>
    </theader>
    <tbody>
        <tr><td colspan="6">I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS
          <ul>
          <li><strong>I. Pilas iguales (6 puntos)</strong>
             <ul>
	     <li><img src="img/invertido.jpg?raw=true" alt="image_1" style witdh="150"; height="150"/></li>
 	     <li>-----.</li>
	    </ul>
           </li>
          </ul>
          <ul>
          <li><strong>II. Pilas (6 puntos)</strong>
          <ul>
	     <li><img src="img/isEmpty.png?raw=true" alt="image_1" style witdh="150"; height="100"/></li>
	      </ul>
           <li>En este metodo lo unico que sea hace es comparar la raiz, ya que si esta se encuentra vacia nos indica que no hay ningun elemento en la pila.</li>
             <ul>
	     <li><img src="img/peek.png?raw=true" alt="image_1" style witdh="150"; height="150"/></li>
	      </ul>
           <li>En el metodo peek se recorre la pila hasta llegar al ultimo elemento que es el que esta en la parte superior de la pila y lo muestra.</li>
           <ul>
	     <li><img src="img/pop.png?raw=true" alt="image_1" style witdh="150"; height="150"/></li>
	      </ul>
           <li>En este metodo llamado pop, tambien se recorre la pila hasta llegar al ultimo elemento el cual es sacado de la pila y mostrado.</li>
           <ul>
	     <li><img src="img/push.png?raw=true" alt="image_1" style witdh="150"; height="250"/></li>
	      </ul>
           <li>En este metodo, recorremos la pila para llegar al ultimo elemento al cual le añadimos la referencia del nuevo nodo(que contiene el nuevo dato a ingresar).</li>
           <ul>
	     <li><img src="img/search.png?raw=true" alt="image_1" style witdh="150"; height="350"/></li>
	      </ul>
           <li>En este metodo search, se recorre la pila buscando el elemento deseado devolviendo su posicion y en caso este elemento no se encuentre devuelve -1.</li>
           <ul>
	     <li><img src="img/toString.png?raw=true" alt="image_1" style witdh="150"; height="150"/></li>
	      </ul>
           <li>Lo único que hace este elemento es imprimir la pila.</li>
          </ul>
          <ul>
		  <li><strong>III. Colas (6 puntos)</strong>
             <ul>
	            <li><img src="img/Interface.png" alt="image_1" style witdh="150"; height="150"/></li>
		  </ul>
	     <li> Se coloca un interface donde contiene los métodos Queue, donde tres de ellos (add, remove, element) son parecidos a otros tres, solo que estos votan una excepción.</li><ul>
		  <li><img src = "img/Add.png" alt="image_2" style witdh="150"; height= "180"/></li>
              </ul>
		  <li>En la imagen se observa como se usa el add, en la cual en la condición if, verifica si esta vacio o no, para colocar en primera el elemento o recorrer la cola y colocar al final el elemento.</li>
		  <ul>
			  <li><img src="img/Remove.png" alt="image_1" style witdh="150"; height="150"/></li>
		  </ul>
		  <li> Se da el mismo comportamiento del <em>Add()</em> para el remove y el element, no obstante este elimina un nodo, reemplazandolo por el siguiente del siguiente en caso del remove y en el element simplemente arroja el elemento cabecera de la cola.</li> 
		  <ul>
			<li><img src="img/Extras.png" alt="image_1" style witdh="150"; height="150"/></li>
		  </ul>
		  <li> Los métodos mostrados en la imagen tienen como función, verificar si la cola esta vacio o tiene elementos y el otro imprime lo que contiene la cola; respectivamente. Para verificar todos estos métodos se crea la clase <strong><em>Test3</em></strong> donde se tiene el siguiente resultado.</li>
		  <ul>
			  <li><img src="img/Resultado.png" alt="image_1" style witdh="150"; height="150"/></li>
		  </ul>
           </li>
          </ul>
          </td></tr>   
        <tr><td colspan="6">II. SOLUCIÓN DEL CUESTIONARIO
         <ul>
         <li>¿Qué similitudes hay entre una Lista Enlazada y una Pila? ( 1 pt)
              <ul>
                   <li>Ambos trabajan con nodos, los cuales ademas de almacenar un dato tambien almacenan la referencia del siguiente nodo.</li>
 	       </ul>
 		<ul>
                   <li> Ambas son ideales para reforzar reglas de acceso secuencial lo que permite tener el control de quien entra y quien sale.</li>
 	       </ul>
          </li>
        <li>¿En que casos seria favorable/desfavorable utilizar Pila/Cola? ( 1 pt)
	<li>Pilas
	   <ul>
                <li>Favorable 
		    <ul>
			<li>En realizar la operacion deshacer en los editores de texto.</li>
			<li>Para ir hacia "atras" o "siguiente" en los botones de navegacion.</li>
		    </ul>
		</li>
		<li>Desfavorable
		    <ul>
			<li> En casos que requieran demasiado uso de memoria debido a su escaso limite de memoria.</li>
			<li>Quere acceder a un elemento se tiene que remover todo hasta llegar a el y volver a colocar .</li>
		    </ul>
		</li> 
          </ul>
	</li>
	<li>Colas
	   <ul>
               <li>Favorable 
		    <ul>
			<li> Cuando un recurso se comparte entre diferentes usuarios, 
				por ejemplo imprimir en una sola impresora.</li>
			<li>En el orden de proceso de operaciones de una CPU.</li>
		    </ul>
		</li>
		<li>Desfavorable
		    <ul>
			<li>Querer quitar elementos que se encuentren en la mitad puede llegar a ser un proceso que requiera mucho tiempo.</li>
			<li>La búsqueda de algún elemento en específico puede ser una tarea ineficiente.</li>
		    </ul>
		</li> 
          </ul>
	</li>
        </li>
         </ul>
        </td></tr>
        <tr><td colspan="6">III. CONCLUSION
           <li>Tanto las pilas como las colas son colecciones de elementos organizados pero con diferentes 
principios de ejecucion que son importantes en estructuras de datos y que pueden ser utilizados de manera eficiente
 en diferentes condiciones. </li>
</td></tr>
 </tbody>
</table>

<table>
    <theader>
        <tr><th>RETROALIMENTACIÓN</th></tr>
    </theader>
    <tbody>
         <tr><td colspan="6">                       </td></tr>
    </tbody>
</table>

<table>
    <theader>
        <tr><th>REFERENCIAS Y BIBLIOGRAFIA</th></tr>
    </theader>
    <tbody>
        <tr><td>
            <ul>
                <li>https://www.w3schools.com/java/</li>
                <li>https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developer</li>
                <li>https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html</li>
                <li>https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html</li>
            </ul></td>
        </tr>
    </tbody>
</table>
