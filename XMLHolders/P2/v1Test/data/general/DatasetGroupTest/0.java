@Test
    public void testSerialization() {
        DatasetGroup g1 = new DatasetGroup();
        DatasetGroup g2 = (DatasetGroup) TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

}