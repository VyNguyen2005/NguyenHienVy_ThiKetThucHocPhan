<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.TheLoai"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="card mb-3">
    <%
        ArrayList<TheLoai> dsTheLoai = (ArrayList<TheLoai>) request.getAttribute("dsTheLoai");
    %>
    <h3 class="card-header">Category</h3>  
    <ul class="list-group list-group-flush">
        <%
            if (dsTheLoai != null) {
                for (TheLoai chude : dsTheLoai) {
        %>
        <li class="list-group-item"> <a href="san-pham?maloai=<%= chude.getMaloai()%>"><%= chude.getTenloai()%></a> </li>
            <%}
                }%>
    </ul>   
</div>
