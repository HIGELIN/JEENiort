<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Calculatrice</title>
    </head>
    <body>
        <form method="post" action="">
            <input name ="valeur1" type="number" size=3/>
            <select name="operateur" size="1">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="x">x</option>
                <option value="/">/</option>
            </select>
            <input name ="valeur2" type="number" size=3/>
            <input type="submit" value="=" />
        </form>

            Résultat = ${requestScope.Operation}<br>

    </body>
</html>