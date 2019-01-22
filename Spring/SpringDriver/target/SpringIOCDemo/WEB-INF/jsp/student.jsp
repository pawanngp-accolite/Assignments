<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"  %>
<!DOCTYPE html>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Student Information</h2>
      <form method = "POST" action = "/SpringTutTest/addDriver" name="driver" modelAttribute="driver">
         <table>
            <tr>
               <td><form:label path = "name">DRIVER NAME</form:label></td>
               <td><input name = "driverName" /></td>
               <td>la</td>
            </tr>
            <tr>
               <td><form:label path = "id">Driver ID</form:label></td>
                <td><input name = "driverId" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form>
   </body>
   
</html>