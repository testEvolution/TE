@Test
    public void testSerialization() {
        XYCoordinate v1 = new XYCoordinate(1.0, 2.0);
        XYCoordinate v2 = (XYCoordinate) TestUtils.serialised(v1);
        assertEquals(v1, v2);
    }

}