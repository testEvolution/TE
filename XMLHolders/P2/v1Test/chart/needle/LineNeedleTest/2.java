@Test
    public void testSerialization() {
        LineNeedle n1 = new LineNeedle();
        LineNeedle n2 = (LineNeedle) TestUtils.serialised(n1);
        assertTrue(n1.equals(n2));
    }

}