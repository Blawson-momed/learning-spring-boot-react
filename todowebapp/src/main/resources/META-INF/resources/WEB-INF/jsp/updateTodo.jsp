<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="Container">
	<h1>Update Todo Details :</h1>
	<hr>
	<form:form method="post" modelAttribute="updateTodo">
		<fieldset class="mb-3">
			<form:label path="description">Description: </form:label>
			<form:input type="text" path="description" required="required" />
			<form:errors type="text" path="description" cssClass="text-warning" />
		</fieldset>

		<!--### Add a text field for a comment / description to give more details about the todo ###-->

		<fieldset class="mb-3">
			<form:label path="targetdate">Target Date: </form:label>
			<form:input type="text" path="targetdate" id="targetdate" />
			<form:errors type="text" path="targetdate" cssClass="text-warning" />
		</fieldset>

		<fieldset class="mb-3">
			<form:label path="done">is Done: </form:label>
			<form:input type="text" path="done" />
			<form:errors type="text" path="done" cssClass="text-warning" />
		</fieldset>

		<input type="submit" value="Submit" class="btn btn-success" />

		<form:input type="hidden" path="id" />
	</form:form>
</div>
<%@ include file="common/footer.jspf" %>
<script type="text/javascript">
	$('#targetdate').datepicker({
		format : 'yyyy-mm-dd'
	});
</script>





