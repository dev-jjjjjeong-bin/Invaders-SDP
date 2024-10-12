package twoplayermode;

import entity.Ship;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class PlayerShip extends Ship {

    private Image shipImage;  // PlayerShip에 이미지 필드를 추가

    // 생성자에서 이미지 파일 경로를 받아 처리
    public PlayerShip(final int positionX, final int positionY, String imagePath) {
        super(positionX, positionY);  // Ship 클래스의 기존 생성자 호출

        // 이미지 로드
        try {
            this.shipImage = ImageIO.read(new File(imagePath));  // 이미지 파일 로드
        } catch (IOException e) {
            e.printStackTrace();
            this.shipImage = null;  // 이미지 로드 실패 시 기본 처리
        }
    }

    // 좌표 값을 반환하는 메서드 추가
    public int getX() {
        return this.positionX;  // Ship에서 상속받은 positionX 사용
    }

    public int getY() {
        return this.positionY;  // Ship에서 상속받은 positionY 사용
    }

    // 이미지가 있으면 렌더링하는 메서드 추가
    public void render(Graphics2D g) {
        if (this.shipImage != null) {
            g.drawImage(this.shipImage, this.getX(), this.getY(), null);
        } else {
            // 이미지가 없으면 기본 사각형으로 우주선을 그립니다.
            g.setColor(java.awt.Color.GREEN);
            g.fillRect(this.getX(), this.getY(), this.width, this.height);
        }
    }
}
