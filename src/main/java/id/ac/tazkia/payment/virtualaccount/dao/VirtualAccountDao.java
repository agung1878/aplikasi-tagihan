package id.ac.tazkia.payment.virtualaccount.dao;

import id.ac.tazkia.payment.virtualaccount.entity.VirtualAccount;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VirtualAccountDao extends PagingAndSortingRepository<VirtualAccount, String> {
}