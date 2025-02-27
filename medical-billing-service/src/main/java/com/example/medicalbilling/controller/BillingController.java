import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.medicalbilling.model.Bill;
import com.example.medicalbilling.service.BillingService;

import java.util.List;

@RestController
@RequestMapping("/api/bills")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @PostMapping
    public ResponseEntity<Bill> createBill(@RequestBody Bill bill) {
        Bill createdBill = billingService.saveBill(bill);
        return ResponseEntity.ok(createdBill);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bill> getBill(@PathVariable Long id) {
        Bill bill = billingService.findBillById(id);
        return bill != null ? ResponseEntity.ok(bill) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Bill>> getAllBills() {
        List<Bill> bills = billingService.findAllBills();
        return ResponseEntity.ok(bills);
    }

    @GetMapping("/print/{id}")
    public ResponseEntity<String> printBill(@PathVariable Long id) {
        Bill bill = billingService.findBillById(id);
        if (bill != null) {
            // Logic to print the bill (could be a PDF generation or similar)
            return ResponseEntity.ok("Bill printed successfully for ID: " + id);
        }
        return ResponseEntity.notFound().build();
    }
}