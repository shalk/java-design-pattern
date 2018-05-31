package com.xshalk.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DJView extends HttpServlet {
    @Override
    public void init() throws ServletException {
        BeanModel beanModel = new BeanModel();
        beanModel.initialize();
        getServletContext().setAttribute("beatModel", beanModel);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BeanModel beanModel = (BeanModel) getServletContext().getAttribute("beatModel");
        String bpm = req.getParameter("bpm");
        if (bpm == null) {
            bpm = beanModel.getBmp() + "";
        }

        String set = req.getParameter("set");
        if (set != null) {
            int bpmNumber;
            bpmNumber = Integer.parseInt(bpm);
            beanModel.setBmp(bpmNumber);
        }

        String decrease = req.getParameter("descrease");
        if (decrease != null) {
            beanModel.setBmp(beanModel.getBmp() - 1);
        }

        String increase = req.getParameter("increase");
        if (increase != null) {
            beanModel.setBmp(beanModel.getBmp() + 1);
        }

        if (req.getParameter("on") != null) {
            beanModel.on();
        }

        if (req.getParameter("off") != null) {
            beanModel.off();
        }

        req.setAttribute("beatModel", beanModel);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/jsp/DJView.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    }
}
