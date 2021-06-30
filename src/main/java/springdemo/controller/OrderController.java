package springdemo.controller;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springdemo.dao.OrderDao;
import springdemo.pojo.Order;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    OrderDao orderDao;

    @RequestMapping("/order/list")
    public String toorder(Model model){
        List<Order> order = orderDao.getOrder();
        model.addAttribute("orders",order);
        return "order/list";
    }
    @GetMapping("/order/add")
    public String toadd(){
        return "order/add";
    }
    @PostMapping("/order/add")
    public String foradd(Order order){
        orderDao.addOrder(order);
        return "redirect:/order/list";
    }
    @GetMapping("/order/update/{id}")
    public String toupdate(@PathVariable("id")Integer id,Model model){
        Order order = orderDao.getOrderbyid(id);
        model.addAttribute("orders",order);
        return "order/update";
    }
    @PostMapping("/order/update")
    public String forupdate(Order order){
        orderDao.updateOrder(order);
        return "redirect:/order/list";
    }
    @GetMapping("/order/delete/{id}")
    public String fordelete(@PathVariable("id") Integer id){
        orderDao.deleteOrderbyid(id);
        return "redirect:/order/list";
    }
}
