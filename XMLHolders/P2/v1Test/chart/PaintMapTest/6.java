@Test
    public void testKeysOfDifferentClasses() {
        PaintMap m = new PaintMap();
        m.put("ABC", Color.RED);
        m.put(99, Color.BLUE);
        assertEquals(Color.BLUE, m.getPaint(99));
    }

}