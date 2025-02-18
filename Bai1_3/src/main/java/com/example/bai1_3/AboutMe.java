package com.example.bai1_3;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AboutMe")
public class AboutMe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("hoTen", "Ngô Quang Huy");
        request.setAttribute("mssv", "64130851");
        request.setAttribute("lop", "64.CNTT - CLC1");
        request.setAttribute("truong", "Trường Đại học Nha Trang - NTU");
        request.setAttribute("anh", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.reddit.com%2Fr%2FMemeRestoration%2Fcomments%2Fpsd7n6%2Fcan_someone_restore_this_peter_griffin_meme%2F&psig=AOvVaw3t-lfJ-8FYyZaShdjB2Ujr&ust=1739972654476000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNiCk76tzYsDFQAAAAAdAAAAABAE");

        request.getRequestDispatcher("/AboutMe.jsp").forward(request, response);
    }
}