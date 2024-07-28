package Repository;

import java.util.List;

import Model.InventoryModel;

public interface InventoryRepository {

	public int isAddPart(InventoryModel iModel);

	public boolean isUpdatePart(InventoryModel iModel1);

	public InventoryModel getSparePartDetails(String partName);

	public List<InventoryModel> getAllSparePartDetails();

	public boolean isDeleteSparePart(String partName);
	
	public boolean isDeleteSparePart(int PId);

	public int getPriceOfSparePart(String partName);

	public List<InventoryModel> searchAllSparePartDetailsByName(String partName);

}
