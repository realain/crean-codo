package cleancode.minesweeper.tobe.cell;

import java.util.Objects;

public class CellSnapshot {

    private final CellSnapShotStatus status;
    private final int nearbyLandMineCount;

    private CellSnapshot(CellSnapShotStatus status, int nearbyLandMineCount) {
        this.status = status;
        this.nearbyLandMineCount = nearbyLandMineCount;
    }

    public static CellSnapshot of(CellSnapShotStatus status, int nearbyLandMineCount) {
        return new CellSnapshot(status, nearbyLandMineCount);
    }

    public static CellSnapshot ofEmpty() {
        return of(CellSnapShotStatus.EMPTY, 0);
    }

    public static CellSnapshot ofFlag() {
        return of(CellSnapShotStatus.FLAG, 0);
    }

    public static CellSnapshot ofLandMine() {
        return of(CellSnapShotStatus.LAND_MINE, 0);
    }

    public static CellSnapshot ofNumber(int nearbyLandMineCount) {
        return of(CellSnapShotStatus.NUMBER, nearbyLandMineCount);
    }

    public static CellSnapshot ofUnchecked() {
        return of(CellSnapShotStatus.UNCHECKED, 0);
    }

    public boolean isSameStatus(CellSnapShotStatus cellSnapShotStatus) {
        return this.status == cellSnapShotStatus;
    }

    public CellSnapShotStatus getStatus() {
        return status;
    }

    public int getNearbyLandMineCount() {
        return nearbyLandMineCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CellSnapshot snapshot = (CellSnapshot) o;
        return nearbyLandMineCount == snapshot.nearbyLandMineCount && status == snapshot.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, nearbyLandMineCount);
    }

}
