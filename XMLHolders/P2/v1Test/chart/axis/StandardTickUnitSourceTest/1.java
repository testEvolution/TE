@Test
    public void testSerialization() {
        StandardTickUnitSource t1 = new StandardTickUnitSource();
        StandardTickUnitSource t2 = (StandardTickUnitSource) TestUtils.serialised(t1);
        assertEquals(t1, t2);
    }

}