package com.zx.mes.test;

/**
 * Created by hyl on 17/6/12.
 */
public class TestContex {
//    <resultMap id="resourceResultMap" type="com.zx.mes.model.admin.Resource" extends="BaseResultMap">
//    <association property="resourceType" jdbcType="com.zx.mes.model.admin.ResourceType">
//      <id column="ID"  property="id" />
//      <result column="NAME"  property="name" />
//    </association>
//  </resultMap>
//  <select id="getResourceWithType" parameterType="com.zx.mes.model.admin.Resource" resultMap="resourceResultMap">
//    SELECT DISTINCT tresource.ID,
//    tresource.ICON,
//    tresource.NAME,
//    tresource.REMARK,
//    tresource.URL,
//    tresource.SEQ,
//    tresource.PID,
//    tresource.TRESOURCETYPE_ID resourcetype_id,
//    tresourcetype.ID resourcetype_id,
//    tresourcetype.NAME resourcetype_name
//    FROM tresource  JOIN tresourcetype ON tresource.TRESOURCETYPE_ID = tresourcetype.ID
//    where 1=1
//    <!--<if test="tresourcetypeId !=null and tresourcetypeId !=''">-->
//      <!--and resourcetype_id =#{tresourcetypeId,VARCHAR}-->
//    <!--</if>-->
//    order by tresource.SEQ
//            </select>
//
//  <select id="getResourceWithTypeUser" parameterType="com.zx.mes.model.admin.Resource" resultMap="resourceResultMap">
//    SELECT tresource.ID,
//    tresource.ICON,
//    tresource.NAME,
//    tresource.REMARK,
//    tresource.SEQ,
//    tresource.URL,
//    tresource.PID,
//    tresource.TRESOURCETYPE_ID,
//    trole.ID,
//    trole.NAME,
//    trole.REMARK,
//    trole.SEQ,
//    trole.PID,
//    tresourcetype.ID,
//    tresourcetype.NAME,
//    tuser.ID,
//    tuser.NAME
//    FROM tresource  JOIN trole_tresource ON tresource.ID = trole_tresource.TRESOURCE_ID
//    JOIN tresourcetype ON tresource.TRESOURCETYPE_ID = tresourcetype.ID
//    JOIN trole ON trole_tresource.TROLE_ID = trole.ID
//    JOIN tuser_trole ON trole.ID = tuser_trole.TROLE_ID
//    JOIN tuser ON tuser_trole.TUSER_ID = tuser.ID
//    where 1=1
//    <!--<if test="tresourcetypeId !=null and tresourcetypeId !=''">-->
//      <!--and tresourcetype.ID =#{tresourcetypeId,VARCHAR}-->
//    <!--</if>-->
//    <if test="userId !=null and userId !=''">
//    and tuser.ID =#{userId,jdbcType=VARCHAR}
//    </if>
//    order by tresource.SEQ
//            </select>
}
