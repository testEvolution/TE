@Test
    public void testSerialization() {
        ArrowNeedle n1 = new ArrowNeedle(false);
        ArrowNeedle n2 = (ArrowNeedle) TestUtils.serialised(n1);
        assertTrue(n1.equals(n2));
    }

}