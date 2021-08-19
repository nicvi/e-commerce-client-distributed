package sdcn.project.ecommerce_client_distributed.bill;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import sdcn.project.ecommerce_client_distributed.bill.Bill;

public class BillComparator extends DiffUtil.ItemCallback<Bill> {
    @Override
    public boolean areItemsTheSame(@NonNull Bill oldItem, @NonNull Bill newItem) {
        return oldItem.getBillID().equals(newItem.getBillID());
    }

    @Override
    public boolean areContentsTheSame(@NonNull Bill oldItem, @NonNull Bill newItem) {
        return oldItem.getBillID().equals(newItem.getBillID());
    }
}