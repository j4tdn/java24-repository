package view;

public class Ex04ReadNumber {

	public static void main(String[] args) {
		int n = 231;
		System.out.println(read(n));
	}

	private static String read(int n) {
		int hundreds, dozens, unitRow;
		String result = "";

		hundreds = n / 100;
		dozens = (n - hundreds * 100) / 10;
		unitRow = n % 10;

		result += readHundreds(hundreds);
		result += readDozens(dozens);
		
		if (hundreds == 0 && dozens == 0) {
			result += readUnitRow(unitRow);
		} else if (dozens == 0) {
			result += "lẻ ";
			result += readUnitRow(unitRow);
		} else if (dozens != 1 && unitRow == 1) {
			result += "mốt";
		} else {
			result += readUnitRow(unitRow);
		}
		return result;
	}

	private static String readHundreds(int n) {
		switch (n) {
		case 1:
			return "một trăm ";
		case 2:
			return "hai trăm ";
		case 3:
			return "ba trăm ";
		case 4:
			return "bốn trăm ";
		case 5:
			return "năm trăm ";
		case 6:
			return "sáu trăm ";
		case 7:
			return "bảy trăm ";
		case 8:
			return "tám trăm ";
		case 9:
			return "chín trăm ";
		default:
			return "";
		}

	}

	private static String readDozens(int n) {
		switch (n) {
		case 1:
			return "mười ";
		case 2:
			return "hai mươi ";
		case 3:
			return "ba mươi ";
		case 4:
			return "bốn mươi ";
		case 5:
			return "năm mươi ";
		case 6:
			return "sáu mươi ";
		case 7:
			return "bảy mươi ";
		case 8:
			return "tám mươi ";
		case 9:
			return "chín mươi ";

		default:
			return "";
		}

	}

	private static String readUnitRow(int n) {
		switch (n) {
		case 1:
			return "Một";
		case 2:
			return "Hai";
		case 3:
			return "Ba";
		case 4:
			return "Bốn";
		case 5:
			return "Năm";
		case 6:
			return "Sáu";
		case 7:
			return "Bảy";
		case 8:
			return "Tám";
		case 9:
			return "Chín";
		default:
			return "";
		}

	}

}
