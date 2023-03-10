package customDAO;

import java.util.*;

public class ItemDAO {
	// 상품정보
	public static ArrayList<Items> itemList;

	public ItemDAO() {
		if (itemList == null) {
			init();
		}
	}

	private void init() {
		itemList = new ArrayList<Items>(); // 상품 arraylist만들기

		itemList.add(new Items(0, "오리목뼈", 4500, "./img/오리목뼈.PNG",
				"오리목뼈는 연골 사이사이에 살이 붙어 강아지들이 " + "\n 먹는 재미가 있고 치석제거에도 도움이 됩니다. ", "간식"));

		itemList.add(
				new Items(1, "닭고기육포", 5500, "./img/닭고기육포.PNG", "자연에서 온 신선하고 안전한 재료" + "\n 고담백 저지방 다이어트 영양간식!", "간식"));

		itemList.add(new Items(2, "도기넛칩", 7000, "./img/도기넛칩.PNG",
				"반려동물의 영양 밸런스를 채워주세요!" + "\n  높은 소화 흡수율, 피부와 모질개선, 알러지 예방, 체형관리" + "\n  사료위에 토핑으로 급여해도 좋고 단독으로도 좋습니다",
				"간식"));

		itemList.add(new Items(3, "소근스틱", 5300, "./img/소근스틱.PNG",
				"칼슘이 풍부하고 고단백 저 콜레스테롤 식품" + "\n  저지방 고단백 간식으로 기력회복과 저알러지 식품입니다.", "간식"));

		itemList.add(
				new Items(4, "우드스틱", 5000, "./img/우드스틱.PNG", "100% 친환경 커피나무로 만든" + "\n  치석제거가 탁월한 커피 스틱입니다.", "장난감"));

		itemList.add(new Items(5, "터그볼", 6900, "./img/터그볼.PNG", "순면 재질의 물수있는 끈이 있어 " + "\n  이갈이와 이청소를 동시에 해결!", "장난감"));

		itemList.add(new Items(6, "당근밭 노즈워크", 23900, "./img/당근밭노즈워크.PNG",
				"고급 메쉬 소재 사용" + "\n 숙련도에 맞춰 난이도 조절" + "\n 개별 세탁 가능한 분리형 설계", "장난감"));

		itemList.add(new Items(7, "삑삑이공", 4300, "./img/삑삑이공.PNG",
				"삑삑 소리로 청각을 자극하고" + "\n 부드럽고 말랑한 라텍스 재질로" + "\n 안전하게 가지고 놀수있는 장난감입니다.", "장난감"));

		itemList.add(new Items(8, "배변봉투(리필)120매", 7800, "./img/배변봉투(리필)120매.PNG",
				"옥수수로 만든 100% 생분해" + "\n Zero Plastic 배변봉투입니다.", "위생"));

		itemList.add(new Items(9, "눈물자국시트30매", 3000, "./img/눈물자국시트30매.PNG", "잡균제거와 눈물자국 제거" + "\n 시원하게 한번에 OK!", "위생"));

		itemList.add(new Items(10, "한장쓱패드400매", 28650, "./img/한장쓱패드400매.PNG", "깔끔한 소형견을 위한" + "\n 한장쓱패드!", "위생"));

		itemList.add(new Items(11, "명품패드300매", 46200, "./img/명품패드300매.PNG",
				"유해물질을 걱정하지 않아도 되는 우수한 품질" + "\n 최고급 원자재를 사용하여 제품의 질이 우수", "위생"));

		itemList.add(new Items(12, "X자하네스", 18900, "./img/X자 하네스.PNG", "100% 국내재료로 생산" + "\n 편안함에 신축성을 더함!", "산책"));

		itemList.add(new Items(13, "리드줄", 9900, "./img/리드줄.PNG",
				"소형견이든 중형견이든 대형견이든," + "\n 반려견의 사이즈에 구애받지 말고 이용하실수있도록" + "\n 리드줄 두깨의 선택 폭을 확장했습니다.", "산책"));

		itemList.add(new Items(14, "휴대용물병", 26000, "./img/휴대용물병.PNG",
				"널찍한 그릇이 일체형으로 구성!" + "\n 물통과 그릇이 분리되기 때문에 보호자도" + "\n 함께 목을 축이기 좋아요!", "산책"));

		itemList.add(new Items(15, "LED목걸이", 12900, "./img/LED목걸이.PNG",
				"발열 걱정없이 유해물질없는 안전한 제품!" + "\n 어두운 밤 산책할때, 캠핑갈때 활용하세요!", "산책"));

		// 추가
		itemList.add(new Items(16, "강아지관절영양제", 30000, "강아지관절_영양제.PNG", "강아지 관절 걱정없이!" + "\n 강아지 뼈가 아파하면!", "산책"));
		itemList.add(
				new Items(17, "강아지기관지영양제", 15000, "강아지기관지영양제.PNG", "유해물질 흡입 걱정 없이 !" + "\n 강아지 기관지는 이제 영양제로!", "산책"));
		itemList.add(new Items(18, "강아지눈영양제", 12900, "강아지눈_영양제.PNG", "강아지 눈 걱정은 이제 투개더!" + "\n 댕댕이가 눈을 쳐다보기 힘들어 할 때!",
				"산책"));
		itemList.add(new Items(19, "강아지심장면역약", 25000, "강아지심장면역약.PNG", "강아지 마음 걱정 이제 그만!" + "\n 갑자기 당황한 상황이 닥쳐도 걱정 없이!",
				"산책"));
		itemList.add(new Items(20, "강아지염증치료제", 15000, "강아지염증치료제.PNG",
				"강아지 피부 걱정은 이제 여기서!" + "\n 강아지와 산책할 때 아픈 피부 보일 필요없이!", "산책"));
		itemList.add(new Items(21, "강아지이빨청결제", 28000, "강아지이빨_청결제.PNG", "강아지 이빨 썩을 걱정 없는!" + "\n 생활하며 강아지 입냄새는 이제 고민타파!",
				"산책"));
		itemList.add(new Items(22, "강아지패딩", 32000, "강아지패딩.PNG", "추운 영하의 날씨에도 댕댕이 추위는 걱정없다!" + "\n 보기만 해도 주인도 몸이 따뜻함을!",
				"산책"));
		itemList.add(new Items(23, "강아지숄더백", 10000, "개냥이숄더백.PNG",
				"강아지와 어느 장소든 쉽게 이동하는 핫템!" + "\n 산책 시 강아지 무서워하는 행인들 걱정도 NO!", "산책"));

	}

	// 상품 찾기
	public Items searchItem(String name) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getName().equals(name)) {
				return itemList.get(i);
			}
		}
		return null;
	}
}
