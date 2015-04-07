package hibernate.classes.views;

/**
 * POJO version of the hibernate entity class for use on the client side.
 * @author Charlie
 * Apr 7, 2015 8:10:42 PM
 */
public class BikeView {
	private String serialNumber;
	private String modelName;
	private String brandName;
	private Integer basketId;
	private Integer orderId;

	public BikeView(String serialNumber, String modelName, String brandName, int basketId, int orderId) {
		this.serialNumber = serialNumber;
		this.modelName = modelName;
		this.brandName = brandName;
		this.basketId = basketId;
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "BikeView [serialNumber=" + serialNumber + ", modelName=" + modelName + ", brandName=" + brandName + ", basketId=" + basketId
				+ ", orderId=" + orderId + "]";
	}
}
