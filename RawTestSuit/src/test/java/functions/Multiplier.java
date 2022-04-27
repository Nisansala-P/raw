package functions;

public class Multiplier {
	public String checkMultiplier(int numArr[]){
		int arrLen = numArr.length;
		String msg = "";
		for(int x = 0; x < arrLen; x++) {
			try {
				if((numArr[x] % 4 == 0) || (numArr[x] % 6 == 0)) {
					msg = (numArr[x] + " is multiplier by 4 or 6");
					if((numArr[x] % 4 == 0) && (numArr[x] % 6 == 0)) {
						msg += (" and both");
					}
				}else {
					msg = (numArr[x] + " is not multiplier of 4 or 6");
				}
			}catch (Exception e) {
				msg = e.getMessage().toString();
			}
		}
		System.out.println(msg);
		return msg;
	}
}
