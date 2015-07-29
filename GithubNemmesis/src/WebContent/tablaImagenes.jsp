<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Juego Colores</title>
<script language="JavaScript"> 
<!-- 

var td1;
var imagenselc;
var primeravez=0;
var cont=0;
 
/* function overTD(td,color){td.bgColor=color;};
function outTD(td,color){td.style.cursor='default';td.bgColor="#FF99FF";};
 */
 
function clickTD(td)
{	
	 if(primeravez==0)
		{
				td1=td;
				imagenselc=td1;
				primeravez=1;
				cont++;
		}else
		{
			if (td.id!=td1.id)
			{
				if (imagenselc=td)
				{
					td='ok.jpg';
					td1='ok.jpg';
					primeravez=0;
					cont++;
					if(cont==20)
					{
						alert("Felicidades has terminado");
					}
				}
				else
					{
					alert("No son iguales");
					}
				
				}
			} 
	}
//--> 
</script>
<!-- onMouseOver="overTD(this,'#FF0000');" onMouseOut="outTD(this,'FFFFFF');"onClick="clickTD(this,'FFFFFF');"  -->
</head>
<body>
    <table WIDTH="1000" HEIGHT="650" border="50px" align=center> <!-- Lo cambiaremos por CSS -->
            <caption>Tabla de Colores</caption>
            <tr>
                <td id="c1" align=center class="enlace"><img name="1" id="i1" src="interrogacion.jpg" onmouseover="this.src='1.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="1" src="1.jpg" width="100" heigth="50" onClick="clickTD(this);"/>
                <td id="c2" align=center class="enlace"><img name="2" id="i2" src="interrogacion.jpg" onmouseover="this.src='2.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="2" src="2.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c3" align=center class="enlace"><img name="3" id="i3" src="interrogacion.jpg" onmouseover="this.src='3.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="3" src="3.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c4" align=center class="enlace"><img name="4" id="i4" src="interrogacion.jpg" onmouseover="this.src='4.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="4" src="4.jpg" width="100" heigth="50" onClick="clickTD(this);" /></td>
                <td id="c5" align=center class="enlace"><img name="5" id="i5" src="interrogacion.jpg" onmouseover="this.src='5.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="5" src="5.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
            </tr>
            <tr>
                <td id="c6" align=center class="enlace"><img name="5" id="i6" src="interrogacion.jpg" onmouseover="this.src='5.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="6" src="5.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c7" align=center class="enlace"><img name="4" id="i7" src="interrogacion.jpg" onmouseover="this.src='4.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="7" src="4.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c8" align=center class="enlace"><img name="3" id="i8" src="interrogacion.jpg" onmouseover="this.src='3.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="8" src="3.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c9" align=center class="enlace"><img name="2" id="i9" src="interrogacion.jpg" onmouseover="this.src='2.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="9" src="2.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c10" align=center class="enlace"><img name="1" id="i10" src="interrogacion.jpg" onmouseover="this.src='1.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="10" src="1.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
            </tr>
            <tr>
                <td id="c11" align=center class="enlace"><img name="3" id="i11" src="interrogacion.jpg" onmouseover="this.src='3.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="11" src="3.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c12" align=center class="enlace"><img name="5" id="i12" src="interrogacion.jpg" onmouseover="this.src='5.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="12" src="5.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c13" align=center class="enlace"><img name="2" id="i13" src="interrogacion.jpg" onmouseover="this.src='2.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="13" src="2.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c14" align=center class="enlace"><img name="1" id="i14" src="interrogacion.jpg" onmouseover="this.src='1.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="14" src="1.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c15" align=center class="enlace"><img name="4" id="i15" src="interrogacion.jpg" onmouseover="this.src='4.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="15" src="4.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
            </tr>
            <tr>
                <td id="c16" align=center class="enlace"><img name="2" id="i16" src="interrogacion.jpg" onmouseover="this.src='2.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="16" src="2.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c17" align=center class="enlace"><img name="1" id="i17" src="interrogacion.jpg" onmouseover="this.src='1.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="17" src="1.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c18" align=center class="enlace"><img name="5" id="i18" src="interrogacion.jpg" onmouseover="this.src='5.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="18" src="5.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c19" align=center class="enlace"><img name="4" id="i19" src="interrogacion.jpg" onmouseover="this.src='4.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="19" src="4.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
                <td id="c20" align=center class="enlace"><img name="3" id="i20" src="interrogacion.jpg" onmouseover="this.src='3.jpg';" onmouseout="this.src='interrogacion.jpg';" alt="20" src="3.jpg" width="100" heigth="50" onClick="clickTD(this);"/></td>
            </tr>
        </table>
</body>
</html>