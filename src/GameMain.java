public class GameMain {
  public static void main(String[] args) {
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();
  
    GameSetting setting = new GameSetting();
    int randomNum = (int) (Math.random() * 5);
  
    int[] locations = {randomNum, randomNum + 1, randomNum + 2};
    setting.setLocationCells(locations);
    boolean isAlive = true;
  
    while (isAlive == true) {
      String guess = helper.getUserInput("숫자를 입력하세요: ");
      String result = setting.checkYourself(guess);
      numOfGuesses++;
      if (result.equals("모두 찾았습니다!!!")) {
        isAlive = false;
        System.out.println(numOfGuesses + " 번째에 성공!!!");
      }
    }
  }
}
