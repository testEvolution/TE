@Test
    public void testGetSetDrawAsLine() {
        CategoryMarker m = new CategoryMarker("X");
        m.addChangeListener(this);
        this.lastEvent = null;
        assertEquals(false, m.getDrawAsLine());
        m.setDrawAsLine(true);
        assertEquals(true, m.getDrawAsLine());
        assertEquals(m, this.lastEvent.getMarker());
    }
}