@Test
    public void testSerialization() {
        SubCategoryAxis a1 = new SubCategoryAxis("Test Axis");
        a1.addSubCategory("SubCategoryA");
        SubCategoryAxis a2 = (SubCategoryAxis) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

    