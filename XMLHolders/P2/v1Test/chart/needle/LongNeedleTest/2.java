@Test
    public void testSerialization() {
        LongNeedle n1 = new LongNeedle();
        LongNeedle n2 = (LongNeedle) TestUtils.serialised(n1);
        assertTrue(n1.equals(n2));
    }

}