package Service;

import java.util.List;

import Model.InventoryModel;
import Repository.InventoryRepository;
import Repository.InventoryRepositoryImpl;

public class InventoryServiceImpl implements InventoryService{
	
	InventoryRepository inventoryRepo=new InventoryRepositoryImpl();

	public int isAddPart(InventoryModel iModel) {
		
		return inventoryRepo.isAddPart(iModel);
	}

	public boolean isUpdatePart(InventoryModel iModel1) {
		
		return inventoryRepo.isUpdatePart(iModel1);
	}

	public InventoryModel getSparePartDetails(String partName) {
		
		return inventoryRepo.getSparePartDetails(partName);
	}

	public List<InventoryModel> getAllSparePartDetails() {
		
		return inventoryRepo.getAllSparePartDetails();
	}

	public boolean isDeleteSparePart(String partName) {
		
		return inventoryRepo.isDeleteSparePart(partName);
	}
	
	public boolean isDeleteSparePart(int PId) {
		
		return inventoryRepo.isDeleteSparePart(PId);
	}

	public int getPriceOfSparePart(String PartName) {
		
		return inventoryRepo.getPriceOfSparePart(PartName);
	}

	@Override
	public List<InventoryModel> searchAllSparePartDetailsByName(String partName) {
		// TODO Auto-generated method stub
		return inventoryRepo.searchAllSparePartDetailsByName(partName);
	}

}
