<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'" label="寄养单号" prop="jiyangdanhao">
            <el-input v-model="ruleForm.jiyangdanhao" 
                placeholder="寄养单号" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.jiyangdanhao" label="寄养单号" prop="jiyangdanhao">
              <el-input v-model="ruleForm.jiyangdanhao" 
                placeholder="寄养单号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="宠物名称" prop="chongwumingcheng">
          <el-input v-model="ruleForm.chongwumingcheng" 
              placeholder="宠物名称" clearable  :readonly="ro.chongwumingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="宠物名称" prop="chongwumingcheng">
              <el-input v-model="ruleForm.chongwumingcheng" 
                placeholder="宠物名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="宠物种类" prop="chongwuzhonglei">
          <el-select :disabled="ro.chongwuzhonglei" v-model="ruleForm.chongwuzhonglei" placeholder="请选择宠物种类">
            <el-option
                v-for="(item,index) in chongwuzhongleiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="宠物种类" prop="chongwuzhonglei">
	      <el-input v-model="ruleForm.chongwuzhonglei"
                placeholder="宠物种类" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="宠物性别" prop="chongwuxingbie">
          <el-select :disabled="ro.chongwuxingbie" v-model="ruleForm.chongwuxingbie" placeholder="请选择宠物性别">
            <el-option
                v-for="(item,index) in chongwuxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="宠物性别" prop="chongwuxingbie">
	      <el-input v-model="ruleForm.chongwuxingbie"
                placeholder="宠物性别" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="是否绝育" prop="shifoujueyu">
          <el-select :disabled="ro.shifoujueyu" v-model="ruleForm.shifoujueyu" placeholder="请选择是否绝育">
            <el-option
                v-for="(item,index) in shifoujueyuOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="是否绝育" prop="shifoujueyu">
	      <el-input v-model="ruleForm.shifoujueyu"
                placeholder="是否绝育" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="宠物年龄" prop="chongwunianling">
          <el-input v-model="ruleForm.chongwunianling" 
              placeholder="宠物年龄" clearable  :readonly="ro.chongwunianling"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="宠物年龄" prop="chongwunianling">
              <el-input v-model="ruleForm.chongwunianling" 
                placeholder="宠物年龄" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="开始时间" prop="kaishishijian">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.kaishishijian" 
                type="date"
                :readonly="ro.kaishishijian"
                placeholder="开始时间">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.kaishishijian" label="开始时间" prop="kaishishijian">
              <el-input v-model="ruleForm.kaishishijian" 
                placeholder="开始时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="寄养时长" prop="jiyangshizhang">
          <el-input v-model="ruleForm.jiyangshizhang" 
              placeholder="寄养时长" clearable  :readonly="ro.jiyangshizhang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="寄养时长" prop="jiyangshizhang">
              <el-input v-model="ruleForm.jiyangshizhang" 
                placeholder="寄养时长" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="托管费用" prop="tuoguanfeiyong">
          <el-input v-model="ruleForm.tuoguanfeiyong" 
              placeholder="托管费用" clearable  :readonly="ro.tuoguanfeiyong"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="托管费用" prop="tuoguanfeiyong">
              <el-input v-model="ruleForm.tuoguanfeiyong" 
                placeholder="托管费用" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="总费用" prop="zongfeiyong">
            <el-input v-model="zongfeiyong"
                placeholder="总费用" readonly></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.zongfeiyong" label="总费用" prop="zongfeiyong">
              <el-input v-model="ruleForm.zongfeiyong" 
                placeholder="总费用" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="宠主姓名" prop="chongzhuxingming">
          <el-input v-model="ruleForm.chongzhuxingming" 
              placeholder="宠主姓名" clearable  :readonly="ro.chongzhuxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="宠主姓名" prop="chongzhuxingming">
              <el-input v-model="ruleForm.chongzhuxingming" 
                placeholder="宠主姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="宠主账号" prop="chongzhuzhanghao">
          <el-input v-model="ruleForm.chongzhuzhanghao" 
              placeholder="宠主账号" clearable  :readonly="ro.chongzhuzhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="宠主账号" prop="chongzhuzhanghao">
              <el-input v-model="ruleForm.chongzhuzhanghao" 
                placeholder="宠主账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="预约时间" prop="yuyueshijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.yuyueshijian" 
                type="datetime"
                :readonly="ro.yuyueshijian"
                placeholder="预约时间">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.yuyueshijian" label="预约时间" prop="yuyueshijian">
              <el-input v-model="ruleForm.yuyueshijian" 
                placeholder="预约时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item class="textarea" v-if="type!='info'" label="寄养原因" prop="jiyangyuanyin">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="寄养原因"
                  v-model="ruleForm.jiyangyuanyin" >
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.jiyangyuanyin" label="寄养原因" prop="jiyangyuanyin">
                    <span>{{ruleForm.jiyangyuanyin}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item class="textarea" v-if="type!='info'" label="备注" prop="beizhu">
                <el-input
                  style="min-width: 200px; max-width: 600px;"
                  type="textarea"
                  :rows="8"
                  placeholder="备注"
                  v-model="ruleForm.beizhu" >
                </el-input>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.beizhu" label="备注" prop="beizhu">
                    <span>{{ruleForm.beizhu}}</span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"rgba(111, 111, 151, 1)","selectFontSize":"14px","btnCancelBorderColor":"#DCDFE6","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"40px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"rgba(255, 255, 255, 0)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(255, 255, 255, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"rgba(255, 255, 255, 1)","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"40px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"3px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(111, 111, 151, 1)","btnSaveBorderWidth":"3px"},
      id: '',
      type: '',
      ro:{
	jiyangdanhao : false,
	chongwumingcheng : false,
	chongwuzhonglei : false,
	chongwuxingbie : false,
	shifoujueyu : false,
	chongwunianling : false,
	kaishishijian : false,
	jiyangshizhang : false,
	tuoguanfeiyong : false,
	zongfeiyong : false,
	chongzhuxingming : false,
	chongzhuzhanghao : false,
	yuyueshijian : false,
	jiyangyuanyin : false,
	beizhu : false,
	ispay : false,
      },
      ruleForm: {
        jiyangdanhao: this.getUUID(),
        chongwumingcheng: '',
        chongwuzhonglei: '',
        chongwuxingbie: '',
        shifoujueyu: '',
        chongwunianling: '',
        kaishishijian: '',
        jiyangshizhang: '',
        tuoguanfeiyong: '',
        zongfeiyong: '',
        chongzhuxingming: '',
        chongzhuzhanghao: '',
        yuyueshijian: '',
        jiyangyuanyin: '',
        beizhu: '',
      },
          chongwuzhongleiOptions: [],
          chongwuxingbieOptions: [],
          shifoujueyuOptions: [],
      rules: {
          jiyangdanhao: [
          ],
          chongwumingcheng: [
          ],
          chongwuzhonglei: [
          ],
          chongwuxingbie: [
          ],
          shifoujueyu: [
          ],
          chongwunianling: [
          ],
          kaishishijian: [
          ],
          jiyangshizhang: [
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          tuoguanfeiyong: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          zongfeiyong: [
                { validator: validateNumber, trigger: 'blur' },
          ],
          chongzhuxingming: [
          ],
          chongzhuzhanghao: [
          ],
          yuyueshijian: [
          ],
          jiyangyuanyin: [
          ],
          beizhu: [
          ],
          ispay: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {


    zongfeiyong:{
      get: function () {
        return 1*this.ruleForm.jiyangshizhang*this.ruleForm.tuoguanfeiyong
      }
    },

  },
  created() {
	this.ruleForm.yuyueshijian = this.getCurDateTime()

	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='jiyangdanhao'){
            this.ruleForm.jiyangdanhao = obj[o];
	    this.ro.jiyangdanhao = true;
            continue;
          }
          if(o=='chongwumingcheng'){
            this.ruleForm.chongwumingcheng = obj[o];
	    this.ro.chongwumingcheng = true;
            continue;
          }
          if(o=='chongwuzhonglei'){
            this.ruleForm.chongwuzhonglei = obj[o];
	    this.ro.chongwuzhonglei = true;
            continue;
          }
          if(o=='chongwuxingbie'){
            this.ruleForm.chongwuxingbie = obj[o];
	    this.ro.chongwuxingbie = true;
            continue;
          }
          if(o=='shifoujueyu'){
            this.ruleForm.shifoujueyu = obj[o];
	    this.ro.shifoujueyu = true;
            continue;
          }
          if(o=='chongwunianling'){
            this.ruleForm.chongwunianling = obj[o];
	    this.ro.chongwunianling = true;
            continue;
          }
          if(o=='kaishishijian'){
            this.ruleForm.kaishishijian = obj[o];
	    this.ro.kaishishijian = true;
            continue;
          }
          if(o=='jiyangshizhang'){
            this.ruleForm.jiyangshizhang = obj[o];
	    this.ro.jiyangshizhang = true;
            continue;
          }
          if(o=='tuoguanfeiyong'){
            this.ruleForm.tuoguanfeiyong = obj[o];
	    this.ro.tuoguanfeiyong = true;
            continue;
          }
          if(o=='zongfeiyong'){
            this.ruleForm.zongfeiyong = obj[o];
	    this.ro.zongfeiyong = true;
            continue;
          }
          if(o=='chongzhuxingming'){
            this.ruleForm.chongzhuxingming = obj[o];
	    this.ro.chongzhuxingming = true;
            continue;
          }
          if(o=='chongzhuzhanghao'){
            this.ruleForm.chongzhuzhanghao = obj[o];
	    this.ro.chongzhuzhanghao = true;
            continue;
          }
          if(o=='yuyueshijian'){
            this.ruleForm.yuyueshijian = obj[o];
	    this.ro.yuyueshijian = true;
            continue;
          }
          if(o=='jiyangyuanyin'){
            this.ruleForm.jiyangyuanyin = obj[o];
	    this.ro.jiyangyuanyin = true;
            continue;
          }
          if(o=='beizhu'){
            this.ruleForm.beizhu = obj[o];
	    this.ro.beizhu = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(json.chongzhuxingming!=''&&json.chongzhuxingming){
                this.ruleForm.chongzhuxingming = json.chongzhuxingming
	    		this.ro.chongzhuxingming = true;
		}
		if(json.chongzhuzhanghao!=''&&json.chongzhuzhanghao){
                this.ruleForm.chongzhuzhanghao = json.chongzhuzhanghao
	    		this.ro.chongzhuzhanghao = true;
		}
        } else {
          this.$message.error(data.msg);
        }
      });
            this.$http({
              url: `option/chongwuzhonglei/chongwuzhonglei`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.chongwuzhongleiOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
         
            this.chongwuxingbieOptions = "公,母".split(',')
            this.shifoujueyuOptions = "是,否".split(',')
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `chongwujiyang/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {
        this.ruleForm.zongfeiyong = this.zongfeiyong

































var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "chongwujiyang/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `chongwujiyang/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.chongwujiyangCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `chongwujiyang/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.chongwujiyangCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.chongwujiyangCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
