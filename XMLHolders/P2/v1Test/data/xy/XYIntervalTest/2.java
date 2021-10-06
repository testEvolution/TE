@Test
    public void testSerialization() {
        XYInterval i1 = new XYInterval(1.0, 2.0, 3.0, 2.5, 3.5);
        XYInterval i2 = (XYInterval) TestUtils.serialised(i1);
        assertEquals(i1, i2);
    }

}