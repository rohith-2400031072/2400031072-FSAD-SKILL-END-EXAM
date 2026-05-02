package com.klef.fsad.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController 
{
    @Autowired
    private DeliveryRepository repo;

    // POST: Add Delivery
    @PostMapping("/add")
    public Delivery add(@RequestBody Delivery d)
    {
        if (d.getDeliveryId() == null) {
            throw new RuntimeException("Delivery ID must not be null");
        }
        return repo.save(d);
    }

    // DELETE: Remove Delivery
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id)
    {
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}