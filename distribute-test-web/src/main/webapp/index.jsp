<html>

<script>
    function test() {
        var v = #{helloWorld};
        alert(v);
    }

</script>
<body>
<h2>Hello World!</h2>

<input type="button" onclick="test()" id="helloWorld" value="Hello world!">

</body>
</html>
